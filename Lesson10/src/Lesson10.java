import inputs.InputData;
import store.CashDesk;
import store.Buyer;
import store.Shop;

import java.util.List;

public class Lesson10 {
    private static final int COUNT_OF_CASH_DESK = 3;
    private static final int COUNT_OF_CONSUMERS = 9;

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " thread start");
        List<Buyer> buyerList = new InputData(COUNT_OF_CONSUMERS, COUNT_OF_CASH_DESK).getConsumerList();
        List<CashDesk> cashDeskList = new InputData(COUNT_OF_CONSUMERS, COUNT_OF_CASH_DESK).getCashDeskList();
        Shop shop = new Shop(buyerList, cashDeskList);
        shop.getCondition();
    }
}
