package store;

import enums.Goods;
import java.util.List;
import java.util.Random;

public class Consumer extends Thread {
    private CashDesk cashDesk;
    private List<CashDesk> cashDeskList;
    private static final int MAX_COUNT_OF_GOODS = Goods.values().length;
    private int countOfGoods;
    private Random random = new Random();

    public Consumer(String name) {
        this.countOfGoods = getCountOfGoods();
        this.setName(name);
    }

    @Override
    public void run() {
        for (CashDesk cashDesk : cashDeskList) {
//            if (cashDesk.getQueue() > 0) {
////                minQueue = cashDesk.getQueue();
//                continue;
//            }
            cashDesk.joinTheQueue(this);
        }
    }

    private int getCountOfGoods() {
        int count = random.nextInt(MAX_COUNT_OF_GOODS);
        while (count == 0) {
            random.nextInt(MAX_COUNT_OF_GOODS);
        }
        return count;
    }

    public int getGoods() {
        return getCountOfGoods();
    }

    public void chooseCashDesk(CashDesk cashDesk) {
        this.cashDesk = cashDesk;
    }

    public void chooseCashDesk(List<CashDesk> cashDeskList) {
        this.cashDeskList = cashDeskList;
    }
}
