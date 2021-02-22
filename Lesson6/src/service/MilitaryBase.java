package service;

import exceptions.MatchingPersonException;
import exceptions.MilitaryBaseOverflowException;
import exceptions.SurNameException;
import interfaces.IPerson;
import model.Person;
import model.Recruit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MilitaryBase {
    private int maxSolders;
    private List<Recruit> recruits = new ArrayList<>();

    public MilitaryBase(int maxSolders) {
        this.maxSolders = maxSolders;
    }

    public int getAvailablePlaces() {
        if (maxSolders < recruits.size()) {
            return 0;
        }
        return maxSolders - recruits.size();
    }

    private void checkForTheMatchingRecruits(List<Person> fitForArmy) throws MatchingPersonException {
        boolean notInTheArmy = true;
        for (Person person : fitForArmy) {
            for (Person recruit : recruits) {
                if (person == recruit ||
                        person.getName().equals(recruit.getName()) &&
                                person.getAge() == recruit.getAge() &&
                                person.getHeight() == recruit.getHeight()) {
                    throw new MatchingPersonException(person.getName() + " are serving in the army now");
                }
                if (notInTheArmy) {
                    addSolder(person);
                }
            }

        }
    }

    private void addSolder(IPerson person) {
        try {
            recruits.add(new Recruit(
                    person.getSex(),
                    person.getAge(),
                    person.getName(),
                    person.getSurname(),
                    person.getHeight(),
                    "Private"));
        } catch (SurNameException e) {
            e.printStackTrace();
        }
    }

    public void setRecruits(List<Person> healthyPeople) throws MilitaryBaseOverflowException {
        if (healthyPeople.size() > 0) {
            if (recruits.size() > 0) {
                if (getAvailablePlaces() > 0 && healthyPeople.size() <= getAvailablePlaces()) {
                    try {
                        checkForTheMatchingRecruits(healthyPeople);
                    } catch (MatchingPersonException e) {
                        e.printStackTrace();
                    }
                } else {
                    throw new MilitaryBaseOverflowException("The Military Base is full");
                }
            } else {
                for (int i = 0; i < maxSolders; i++) {
                    if (i < healthyPeople.size()) {
                        addSolder(healthyPeople.get(i));
                    }
                }
            }
        }
    }

    public List<Recruit> getRecruits() {
        return recruits;
    }

    public void getSurnamesInAlphabeticalOrder() {
        recruits.sort(Comparator.comparing(Recruit::getSurname));
        for (Recruit recruit : recruits) {
            System.out.println(recruit.getSurname() + ", " + recruit.getName());
        }
    }
}
