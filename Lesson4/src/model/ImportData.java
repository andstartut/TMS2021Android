package model;

import interfaces.IImportData;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportData implements IImportData {
    public ImportData() {
    }

    @Override
    public List<Person> createCitizens(int count) {
        Scanner scanner = new Scanner(System.in);
        List<Person> citizens = new ArrayList<>();
        while (citizens.size() < count) {
            System.out.println("New citizen:\nInput name:");
            String name = scanner.nextLine();
            System.out.println("Input sex:");
            String sex = scanner.nextLine();
            System.out.println("Input country:");
            String country = scanner.nextLine();
            System.out.println("Input city:");
            String city = scanner.nextLine();
            System.out.println("Input age:");
            Integer age = scanner.nextInt();
            System.out.println("Input height:");
            Integer height = scanner.nextInt();
            scanner.nextLine();
            Person person = new Person(sex, age, name, height);
            Address address = new Address(country, city);
            person.setAddress(address);
            citizens.add(person);
        }
        return citizens;
    }

    @Override
    public List<Person> createCitizens() {
        List<Person> citizens = new ArrayList<>();

        Person oleg = new Person("man", 20, "Oleg", 184);
        Address addressOleg = new Address("Belarus", "Minsk");
//        oleg.speak();
        oleg.setAddress(addressOleg);
        citizens.add(oleg);
        Person vasiliy = new Person("man", 18, "Vasiliy", 177);
        Address addressVas = new Address("Belarus", "Brest");
        vasiliy.setAddress(addressVas);
        citizens.add(vasiliy);
        Person anna = new Person("woman", 18, "Anna", 170);
        Address addressAnna = new Address("Poland", "Gdansk");
        anna.setAddress(addressAnna);
        citizens.add(anna);
        Person petya = new Person("man", 27, "Petya", 190);
        Address addressPetya = new Address("Belarus", "Minsk");
        petya.setAddress(addressPetya);
        citizens.add(petya);
        return citizens;
    }
}
