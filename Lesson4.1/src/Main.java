import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Computer computer = new Computer();
        for (int i = 0; i < 11; i++) {
            System.out.println("Введите 1 или 0:");
            computer.turnOn(scanner.nextInt());
            if (computer.getComputerStatus() == ComputerCondition.STATE_BREAK) {
                break;
            }
            System.out.println("Введите 1 или 0:");
            computer.turnOff(scanner.nextInt());
            if (computer.getComputerStatus() == ComputerCondition.STATE_BREAK) {
                break;
            }
            System.out.println(computer.info());
        }
    }
}
