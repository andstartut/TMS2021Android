package service;

import model.Person;
import java.util.List;

public class MilitaryOffice {
    private List<Person> people;
    private Person person;
    public MilitaryOffice(List<Person> people) {
        this.people = people;
    }

    public MilitaryOffice(Person person) {
        this.person = person;
    }

    public void info() {
        System.out.println("who is fit for the army: ");
        for (Person person : people) {
            if (person.getSex().equals("man")) {
                if (person.getAge() > 17 & person.getAge() < 28) {
                    if (person.getCountry().equals("Belarus")) {
                        System.out.println(person.getName());
                    }
                }
            }
        }
    }
}
