import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Computer computer = new Computer();
        for (int i = 0; i < 11; i++) {
            computer.turnOn();
            if (computer.getComputerStatus() == ComputerCondition.STATE_BREAK) {
                break;
            }
            computer.turnOff();
            if (computer.getComputerStatus() == ComputerCondition.STATE_BREAK) {
                break;
            }
            System.out.println(computer.info());
        }
    }
}
