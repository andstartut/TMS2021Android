package store;

import enums.Goods;

import java.util.Map;

public class CashDesk {
    private final String name;
    private Buyer buyer;
    private int queue;

    public CashDesk(String name) {
        this.name = name;
    }

    public void joinTheQueue(Buyer buyer) {
        this.buyer = buyer;
        queue++;
        System.out.println(name + " : " + queue + " " + buyer.getName() + " buyers");
        if (getQueue() > 0) {
            getGoods(buyer);
        }
    }

    synchronized private void getGoods(Buyer buyer) {
        System.out.println(getBill());
        if (getQueue() > 0) {
            queue--;
            System.out.println(buyer.getName() + " is goes to the Exit");
        }
    }


    public int getQueue() {
        return queue;
    }

    private String getBill() {
        Map<Goods, Integer> goodsMap = buyer.getGoods();
        StringBuilder bill = new StringBuilder("--" + name + " : " + buyer.getName() + "--\n");
        int totalPrice = 0;
        for (Map.Entry<Goods, Integer> entry : goodsMap.entrySet()) {
            int sumOfTheGoods = entry.getValue() * entry.getKey().getPrice();
            totalPrice += sumOfTheGoods;
            bill.append(entry.getKey()).append(": ").append(entry.getValue()).append("pc. = ").append(sumOfTheGoods).append("\n");
        }
        return bill + ("Total: " + totalPrice + "\n-----");
    }
}
