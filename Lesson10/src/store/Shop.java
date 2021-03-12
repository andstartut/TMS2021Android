package store;

import java.util.List;

public class Shop {
    private List<Consumer> consumers;
    private List<CashDesk> cashDesks;

    public Shop(List<Consumer> consumers, List<CashDesk> cashDesks) {
        this.consumers = consumers;
        this.cashDesks = cashDesks;
    }

    public void getCondition() {
        for (Consumer consumer : consumers) {
            consumer.chooseCashDesk(cashDesks);
            consumer.start();
        }
    }
}
