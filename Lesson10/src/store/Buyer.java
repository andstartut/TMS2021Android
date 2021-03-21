package store;

import enums.Goods;

import java.util.*;


public class Buyer extends Thread {
    private CashDesk cashDesk;
    private List<CashDesk> cashDeskList;
    private Map<Goods, Integer> billMap = new HashMap<>();
    private static final int MAX_COUNT_OF_GOODS = Goods.values().length;
    private Random random = new Random();

    public Buyer(String name) {
        this.setName(name);
    }

    @Override
    public void run() {
        cashDeskList.sort(Comparator.comparingInt(CashDesk::getQueue));
        cashDeskList.get(0).joinTheQueue(this);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private int getCountOfGoods() {
        int count = random.nextInt(MAX_COUNT_OF_GOODS);
        while (count == 0) {
            random.nextInt(MAX_COUNT_OF_GOODS);
        }
        return count;
    }

    public Map<Goods, Integer> getGoods() {
        Goods[] goods = Goods.values();
        for (int i = 0; i < getCountOfGoods(); i++) {
            int value = random.nextInt(getCountOfGoods());
            if (billMap.containsKey(goods[value])) {
                billMap.put(goods[value], billMap.get(goods[value]) + 1);
            } else {
                billMap.put(goods[value], 1);
            }
        }
        return billMap;
    }

    public void chooseCashDesk(CashDesk cashDesk) {
        this.cashDesk = cashDesk;
    }

    public void chooseCashDesk(List<CashDesk> cashDeskList) {
        this.cashDeskList = cashDeskList;
    }
}
