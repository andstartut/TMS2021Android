import model.Person;
import service.MilitaryOffice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Person> people = new ArrayList<>();
        while (people.size() < 5) {
            System.out.println("Input name:");
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
            people.add(new Person(sex, age, name, height, country, city));
        }
//        people.add(new Person("man", 40, "Oleg", 184, "Belarus", "Minsk"));
//        people.add(new Person("man", 15, "Vasiliy", 177, "Belarus", "Minsk"));
//        people.add(new Person("man", 27, "Petya", 190, "Belarus", "Brest"));
//        people.add(new Person("man", 23, "Andrey", 186, "Belarus", "Grodno"));
//        people.add(new Person("woman", 19, "Vika", 170, "Belarus", "Pinsk"));
//        people.add(new Person("woman", 18, "Anna", 170, "Poland", "Gdansk"));

        for (Person person : people) {
            System.out.println(person);
        }
        MilitaryOffice militaryOffice = new MilitaryOffice(people);
        militaryOffice.info();
    }
}
