package store;

import java.util.Random;

public class Consumer extends Thread {
    private CashDesk cashDesk;
    private String name;
    private static final int MAX_COUNT_OF_GOODS = 10;
    private int countOfGoods;
    private Random random = new Random();

    public Consumer(String name, CashDesk cashDesk) {
        this.cashDesk = cashDesk;
        this.name = name;
        this.countOfGoods = getCountOfGoods();
        setName();
    }

    @Override
    public void run() {
        try {
            while (countOfGoods > 0) {
                System.out.println("The " + Consumer.currentThread().getName() + " pais for the " + countOfGoods + " good at the cash desk");
                countOfGoods -= cashDesk.getGoods();
                Thread.sleep(100);
            }
        } catch (InterruptedException e) {
            System.out.println("interrupted");
        }

    }

    private void setName() {
        Consumer.currentThread().setName(name);
    }

    private int getCountOfGoods() {
        int count = random.nextInt(MAX_COUNT_OF_GOODS);
        while (count == 0) {
            random.nextInt(MAX_COUNT_OF_GOODS);
        }
        return count;
    }
}
