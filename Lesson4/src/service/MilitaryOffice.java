package service;

import model.Address;
import model.Person;

import java.util.List;

public class MilitaryOffice {
    private PersonRegistry personRegistry;

    public MilitaryOffice(PersonRegistry personRegistry) {
        this.personRegistry = personRegistry;
    }

    public String suitable(Address address) {
        StringBuilder names = new StringBuilder();
        System.out.println("who is fit for the army: ");
        for (Person person : personRegistry.getCitizens()) {
            if (person.getAddress().getCountry().equals(address.getCountry()) &&
                    person.getAddress().getCity().equals(address.getCity()) &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28) {
                names.append(person.getName()).append("\n");
            }
        }
        return names.toString();
    }

    public String suitable(String country) {
        StringBuilder names = new StringBuilder();
        System.out.println("who is fit for the army: ");
        for (Person person : personRegistry.getCitizens()) {
            if (person.getAddress().getCountry().equals(country) &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28) {
                names.append(person.getName()).append("\n");
            }
        }
        return names.toString();
    }

    public String suitableToHeight(Address address, Integer height) {
        StringBuilder names = new StringBuilder();
        System.out.println("who is fit for the army with a height of more than: ");
        for (Person person : personRegistry.getCitizens()) {
            if (person.getAddress().getCountry().equals(address.getCountry()) &&
                    person.getAddress().getCity().equals(address.getCity()) &&
                    person.getSex().equals("man") &&
                    person.getAge() > 17 && person.getAge() < 28 &&
                    person.getHeight() >= height) {
                names.append(person.getName()).append("\n");
            }
        }
        return names.toString();
    }
}
