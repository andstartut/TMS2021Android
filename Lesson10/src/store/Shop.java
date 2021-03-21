package store;

import java.util.Iterator;
import java.util.List;

public class Shop {
    private List<Buyer> buyers;
    private List<CashDesk> cashDesks;

    public Shop(List<Buyer> buyers, List<CashDesk> cashDesks) {
        this.buyers = buyers;
        this.cashDesks = cashDesks;
    }

    public void getCondition() {
        Iterator<Buyer> iterator = buyers.iterator();
        while (!buyers.isEmpty()) {
            while (iterator.hasNext()) {
                Buyer buyer = iterator.next();
                buyer.chooseCashDesk(cashDesks);
                buyer.start();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                iterator.remove();
            }
        }
    }
}
