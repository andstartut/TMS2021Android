package inputs;

import store.CashDesk;
import store.Consumer;

import java.util.ArrayList;
import java.util.List;

public class InputData {
    private int countOfConsumer;
    private int countOfCashDesk;

    public InputData(int countOfConsumer, int countOfCashDesk) {
        this.countOfConsumer = countOfConsumer;
        this.countOfCashDesk = countOfCashDesk;
    }

    public List<Consumer> getConsumerList() {
        List<Consumer> consumerList = new ArrayList<>();
        for (int i = 1; i <= countOfConsumer; i++) {
            consumerList.add(new Consumer("Consumer_" + i));
        }
        return consumerList;
    }

    public List<CashDesk> getCashDeskList() {
        List<CashDesk> cashDeskList = new ArrayList<>();
        for (int i = 1; i <= countOfCashDesk; i++) {
            cashDeskList.add(new CashDesk("Cash Desk #" + i));
        }
        return cashDeskList;
    }
}
