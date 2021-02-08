package service;

import model.Person;
import model.Recruit;

import java.util.ArrayList;
import java.util.List;

public class MilitaryBase {
    private int maxSolders;
    private List<Recruit> recruits = new ArrayList<>();

    public MilitaryBase(int maxSolders) {
        this.maxSolders = maxSolders;
    }

    public int getAvailablePlaces() {
        return maxSolders - recruits.size();
    }

    private void checkForTheMatchingRecruits(List<Person> fitForArmy) {
        for (Person person : fitForArmy) {
            for (Person recruit : recruits) {
                if (person == recruit ||
                        person.getName().equals(recruit.getName()) &&
                                person.getAge().equals(recruit.getAge()) &&
                                person.getHeight().equals(recruit.getHeight())) {
                    System.out.println(person.getName() + " are serving in the army now");
                } else {
                    addSolder(person);
                }

            }
        }
    }

    private void addSolder(Person person) {
        recruits.add(new Recruit(
                person.getName(),
                person.getAge(),
                person.getSex(),
                person.getHeight(),
                "Private"));
    }

    public void setRecruits(List<Person> healthyPeople) {
        if (healthyPeople.size() > 0) {
            if (recruits.size() > 0) {
                if (getAvailablePlaces() > 0 && healthyPeople.size() <= getAvailablePlaces()) {
                    checkForTheMatchingRecruits(healthyPeople);
                } else {
                    System.out.println("The Military Base is full");
                }
            } else {
                for (Person person : healthyPeople) {
                    addSolder(person);
                }
            }
        }
    }

    public List<Recruit> getRecruits() {
        return recruits;
    }
}
