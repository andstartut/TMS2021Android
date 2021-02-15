import exceptions.MilitaryBaseOverflowException;
import exceptions.NoAddressException;
import exceptions.CantSpeakException;
import model.ImportData;
import model.MutePerson;
import model.Person;
import model.Recruit;
import service.MilitaryBase;
import service.MilitaryOffice;
import service.PersonRegistry;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Person> citizens = new ImportData().createCitizens(5);
        List<Person> citizens = new ImportData().createCitizens();

//        Recruit recruit = new Recruit("man", 20, "Ivan", 185, "General");
//        recruit.setRank("Private");
//        System.out.println(recruit.getRank());
//        Person anotherRecruit = new Recruit("man", 18, "Gleb", 180, "Private");
//        anotherRecruit.speak();

//        for (Person person : citizens) {
//            System.out.println(person);
//        }
        List<MilitaryBase> militaryBaseList = new ArrayList<>();
        PersonRegistry registry = new PersonRegistry(citizens);
        MilitaryBase militaryBase3214 = new MilitaryBase(2);
        militaryBaseList.add(militaryBase3214);
        MilitaryBase militaryBase7434 = new MilitaryBase(10);
        militaryBaseList.add(militaryBase7434);
        MilitaryOffice militaryOffice = new MilitaryOffice(registry, militaryBaseList);

        List<Person> fitPeople = militaryOffice.getHealthyPeople("Belarus");

        System.out.println(fitPeople);

        MutePerson vasya = new MutePerson("man", 20, "Ivan", 185);
        try {
            vasya.speak();
        } catch (CantSpeakException e) {
            e.printStackTrace();
        }

        try {
            militaryBase3214.setRecruits(fitPeople);
        } catch (MilitaryBaseOverflowException e) {
            e.printStackTrace();
        }
        for (Recruit recruit : militaryBase3214.getRecruits()) {
            System.out.println(recruit.toString());
        }
        try {
            militaryBase7434.setRecruits(fitPeople);
        } catch (MilitaryBaseOverflowException e) {
            e.printStackTrace();
        }
        for (Recruit recruit : militaryBase7434.getRecruits()) {
            System.out.println(recruit.toString());
        }

        try {
            militaryOffice.addFitPeopleToTheUnits("Belarus");
        } catch (NoAddressException e) {
            e.printStackTrace();
        } catch (MilitaryBaseOverflowException e) {
            e.printStackTrace();
        }
    }
}
