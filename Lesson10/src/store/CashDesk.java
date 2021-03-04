package store;

public class CashDesk {
//private boolean freeCashDesk = true;
    public CashDesk() {
    }

    synchronized public int getGoods() {
//        freeCashDesk = false;
        return 1;
    }
}
