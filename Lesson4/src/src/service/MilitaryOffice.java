package src.service;

import model.Address;
import model.Person;
import service.PersonRegistry;

import java.util.ArrayList;
import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry;
    private List<Person> fitForArmy = new ArrayList<>();
    private List<MilitaryBase> militaryBaseList;

    public MilitaryOffice(PersonRegistry personRegistry, List<MilitaryBase> militaryBase) {
        this.personRegistry = personRegistry;
        this.militaryBaseList = militaryBase;
    }

    public List<Person> getHealthyPeople(Address address) {
        for (Person person : personRegistry.getPeople(address)) {
            if (person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28) {
                System.out.println(person.getName());
                fitForArmy.add(person);
            }
        }
        return fitForArmy;
    }

    public List<Person> getHealthyPeople(String country) {
        for (Person person : personRegistry.getCitizens()) {
            if (person.getAddress().getCountry().equals(country) &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28) {
                System.out.println(person.getName() + "\n");
                fitForArmy.add(person);
            }
        }
        return fitForArmy;
    }

    public int getCountTheNeededPeople() {
        int countMaxNeededPeople = 0;
        for (MilitaryBase militaryBase : militaryBaseList) {
            countMaxNeededPeople += militaryBase.getAvailablePlaces();
        }
        return countMaxNeededPeople;
    }

    public void addFitPeopleToTheUnits(Address address) {
        List<Person> fitPeople = getHealthyPeople(address);
        List<Person> peopleForMilitaryBase = new ArrayList<>();
        if (fitPeople.size() < getCountTheNeededPeople()) {
            for (MilitaryBase militaryBase : militaryBaseList) {
                for (int i = 0; i < militaryBase.getAvailablePlaces(); i++) {
                    if (i < fitPeople.size()) {
                        peopleForMilitaryBase.add(fitPeople.get(i));
                    } else {
                        break;
                    }
                }
            }
        } else {
            System.out.println("There are more people than the right places");
        }
    }

    public void addFitPeopleToTheUnits(String country) {
        int countPeople = 0;
        List<Person> fitPeople = getHealthyPeople(country);
        List<Person> peopleForMilitaryBase = new ArrayList<>();
        if (fitPeople.size() < getCountTheNeededPeople()) {
            for (MilitaryBase militaryBase : militaryBaseList) {
                for (int i = 0; i < militaryBase.getAvailablePlaces(); i++) {
                    if (i < fitPeople.size()) {
                        peopleForMilitaryBase.add(fitPeople.get(countPeople));
                        countPeople++;
                    } else {
                        break;
                    }
                }
            }
        } else {
            System.out.println("There are more people than the right places");
        }
    }

}
