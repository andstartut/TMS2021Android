package input;

import java.util.Scanner;

public class ConsoleInput {

    public static String getLine() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
