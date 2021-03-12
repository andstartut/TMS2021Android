import inputs.InputData;
import store.Shop;

public class Lesson10 {
    private static final int COUNT_OF_CASH_DESK = 2;
    private static final int COUNT_OF_CONSUMERS = 4;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " thread start");
        new Shop(new InputData(COUNT_OF_CONSUMERS, COUNT_OF_CASH_DESK).getConsumerList(),
                new InputData(COUNT_OF_CONSUMERS, COUNT_OF_CASH_DESK).getCashDeskList())
        .getCondition();
    }
}
