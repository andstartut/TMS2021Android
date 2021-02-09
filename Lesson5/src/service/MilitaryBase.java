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
        if (maxSolders < recruits.size()) {
            return 0;
        }
        return maxSolders - recruits.size();
    }

    private void checkForTheMatchingRecruits(List<Person> fitForArmy) {
        boolean notInTheArmy = true;
        for (Person person : fitForArmy) {
            for (Person recruit : recruits) {
                if (person == recruit ||
                        person.getName().equals(recruit.getName()) &&
                                person.getAge().equals(recruit.getAge()) &&
                                person.getHeight().equals(recruit.getHeight())) {
                    System.out.println(person.getName() + " are serving in the army now");
                    notInTheArmy = false;
                    break;
                }
            }
            if (notInTheArmy) {
                addSolder(person);
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
}
