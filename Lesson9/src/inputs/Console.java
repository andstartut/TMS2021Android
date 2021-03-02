package inputs;

import java.util.Scanner;

public class Console {
    private static Scanner scanner = new Scanner(System.in);

    public static Scanner input() {
        return scanner;
    }

    public static int getInt() {
        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }
    public static String getString() {
        return scanner.nextLine();
    }
}
