package threads;

import java.util.Random;

public class MyThread extends Thread{
    private int countOfGoods;
    private Random random = new Random();
    public MyThread() {
        MyThread.currentThread().setName("MyThread");
        System.out.println(Thread.currentThread().getName());
        countOfGoods = random.nextInt(10);
    }

    @Override
    public void run() {
        super.run();
        System.out.println(MyThread.currentThread().getName() + " is runned");
        while (countOfGoods-- > 0) {
            try {
                MyThread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println("Thread sleeping");
            }
            System.out.println(countOfGoods);
        }
        System.out.println(MyThread.currentThread().getName() + " is closed");
    }
}
