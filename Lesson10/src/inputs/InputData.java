package inputs;

import store.Buyer;
import store.CashDesk;

import java.util.ArrayList;
import java.util.List;

public class InputData {
    private int countOfBuyer;
    private int countOfCashDesk;

    public InputData(int countOfBuyer, int countOfCashDesk) {
        this.countOfBuyer = countOfBuyer;
        this.countOfCashDesk = countOfCashDesk;
    }

    public List<Buyer> getConsumerList() {
        List<Buyer> buyerList = new ArrayList<>();
        for (int i = 1; i <= countOfBuyer; i++) {
            buyerList.add(new Buyer("Buyer" + i));
        }
        return buyerList;
    }

    public List<CashDesk> getCashDeskList() {
        List<CashDesk> cashDeskList = new ArrayList<>();
        for (int i = 1; i <= countOfCashDesk; i++) {
            cashDeskList.add(new CashDesk("Cash Desk #" + i));
        }
        return cashDeskList;
    }
}
