package service;

import exceptions.NoAddressException;
import model.Address;
import model.Person;

import java.util.LinkedList;
import java.util.List;

public class PersonRegistry {
    private List<Person> citizens;

    public PersonRegistry(List<Person> citizens) {
        this.citizens = citizens;
    }

    public int countAddress(Address address) throws NoAddressException {
        int i = 0;
        for (Person person : citizens) {
            if (person.getAddress().getCountry().equals(address.getCountry()) &&
                    person.getAddress().getCity().equals(address.getCity())) {
                i++;
            }
        }
        return i;
    }

    public int countAddress(String country) throws NoAddressException {
        int i = 0;
        for (Person person : citizens) {
            if (person.getAddress().getCountry().equals(country)) {
                i++;
            }
        }
        return i;
    }

    public List<Person> getPeople(Address address) throws NoAddressException {
        List<Person> people = new LinkedList<>();
        for (Person person : citizens) {
            Address personsAddress = person.getAddress();
            if (personsAddress.getCountry().equals(address.getCountry())
                    && personsAddress.getCity().equals(address.getCity())) {
                people.add(person);
            }
        }
        return people;
    }

    public List<Person> getCitizens() {
        return citizens;
    }
}
