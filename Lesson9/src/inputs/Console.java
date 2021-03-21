package inputs;

import exceptions.ConsoleException;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static Scanner input() {
        return scanner;
    }

    public static int getInt() throws ConsoleException {
        int value = scanner.nextInt();
        if (scanner.nextInt() < 0) {
            throw new ConsoleException("You input negative value");
        }
        scanner.nextLine();
        return value;
    }
    public static String getString() {
        return scanner.nextLine();
    }
}
