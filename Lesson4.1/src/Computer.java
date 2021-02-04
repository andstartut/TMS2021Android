import java.util.Random;

public class Computer {
    private final String CPU = "AMD 4GHz 8 core";
    private final String SSD = "512GB";
    private final String RAM = "8GB";
    private int countLifeCycle = 10;
    private ComputerCondition computerCondition;
    Random random = new Random();

    {
        computerCondition = ComputerCondition.STATE_OFF;
    }

    public void turnOn(Integer integer) {
        switch (computerCondition) {
            case STATE_ON:
                System.out.println("Computer are working");
                break;
            case STATE_OFF:
                if (countLifeCycle > 0 && random.nextInt(2) == integer) {
                    computerCondition = ComputerCondition.STATE_ON;
                    System.out.println("Computer ON");
                } else {
                    System.out.println("Computer break!");
                    computerCondition = ComputerCondition.STATE_BREAK;
                }
                break;
            case STATE_BREAK:
                System.out.println("Computer break!");
                break;
        }
    }

    public void turnOff(Integer integer) {
        switch (computerCondition) {
            case STATE_ON:
                if (countLifeCycle > 0 && random.nextInt(2) == integer) {
                    countLifeCycle--;
                    computerCondition = ComputerCondition.STATE_OFF;
                    System.out.println("Computer OFF");
                } else {
                    System.out.println("Computer break!");
                    computerCondition = ComputerCondition.STATE_BREAK;
                }
                break;
            case STATE_OFF:
                System.out.println("Computer aren't working");
                break;
            case STATE_BREAK:
                System.out.println("Computer break!");
                break;
        }
    }

    public ComputerCondition getComputerStatus() {
        return computerCondition;
    }

    public String info() {
        return "CPU: " + CPU + "\n" +
                "RAM: " + RAM + "\n" +
                "SSD: " + SSD + "\n" +
                "Life cycle :" + countLifeCycle;
    }
}
