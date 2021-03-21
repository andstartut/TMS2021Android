package store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private Consumer consumer;
    private CashDesk cashDesk;
    private List<Consumer> consumersList;
    private List<CashDesk> cashDesksList;
    private boolean freeCashDesk = true;
    private int countOfCashDesk;
    private int countOfConsumer;
    private static final int COUNT_OF_CASH_DESK = 4;
    private static final int COUNT_OF_CONSUMER = 8;

//    public Store(Consumer consumer, CashDesk cashDesk) {
//        this.consumer = consumer;
//        this.cashDesk = cashDesk;
//    }

    public Store(int countOfCashDesk, int countOfConsumer) {
        this.countOfCashDesk = countOfCashDesk;
        this.countOfConsumer = countOfConsumer;
    }

    public boolean freeCashDesk() {
        return freeCashDesk;
    }

    private void createConsumers() {
        consumersList = new ArrayList<>();
        for (int i = 0; i < countOfConsumer; i++) {
            consumersList.add(new Consumer("Consumer_" + i, cashDesk));
        }
    }

    private void createCashDesk() {
        cashDesksList = new ArrayList<>();
        for (int i = 0; i < countOfCashDesk; i++) {
            cashDesksList.add(new CashDesk());
        }
    }


}
