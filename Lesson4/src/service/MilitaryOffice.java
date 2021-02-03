package service;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry;
    List<Person> registry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
        registry = personRegistry.getCitizens();
    }

    public String suitable() {
        StringBuilder names = new StringBuilder();
        System.out.println("who is fit for the army: ");
        for (Person person : registry) {
            if (person.getAddress().getCountry().equals("Belarus") &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28) {
                names.append(person.getName()).append("\n");
            }
        }
        return names.toString();
    }

    public String suitableToHeight(Integer height) {
        StringBuilder names = new StringBuilder();
        System.out.println("who is fit for the army with a height of more than: ");
        for (Person person : registry) {
            if (person.getAddress().getCountry().equals("Belarus") &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28 &&
                    person.getHeight() >= height) {
                names.append(person.getName()).append("\n");
            }
        }
        return names.toString();
    }
}
