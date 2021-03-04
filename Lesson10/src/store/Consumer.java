package store;

import java.util.Random;

public class Consumer extends Thread {
    private CashDesk cashDesk;
    private static final int MAX_COUNT_OF_GOODS = 10;
    private int countOfGoods;
    private Random random = new Random();

    public Consumer(String name, CashDesk cashDesk) {
        this.cashDesk = cashDesk;
        Consumer.currentThread().setName(name);
        this.countOfGoods = getCountOfGoods();
        setName(name);
    }

    @Override
    public void run() {
//        try {
            while (countOfGoods > 0) {
                System.out.println("The " + Consumer.currentThread().getName() + " pais for the " + countOfGoods + " goods at the cash desk");
                countOfGoods -= cashDesk.getGoods();
//                Thread.sleep(400);
            }
//        } catch (InterruptedException e) {
//            System.out.println("interrupted");
//        }

    }

    private int getCountOfGoods() {
        int count = random.nextInt(MAX_COUNT_OF_GOODS);
        while (count == 0) {
            random.nextInt(MAX_COUNT_OF_GOODS);
        }
        return count;
    }
}
