import store.CashDesk;
import store.Consumer;
import threads.MyThread;

public class Lesson10 {
    public static void main(String[] args) {
//        System.out.println(Thread.currentThread().getName()+ " thread start");
//        MyThread myThread = new MyThread();
//        myThread.run();
//        System.out.println(Thread.currentThread().getName()+ " thread stop");
//        myThread.interrupt();
        CashDesk cashDesk_1 = new CashDesk();
        CashDesk cashDesk_2 = new CashDesk();
        Consumer consumer_1 = new Consumer("consumer_1", cashDesk_1);
        Consumer consumer_4 = new Consumer("consumer_4", cashDesk_1);
        Consumer consumer_3 = new Consumer("consumer_3", cashDesk_1);
        Consumer consumer_2 = new Consumer("consumer_2", cashDesk_1);
        consumer_1.start();
        consumer_2.start();
        consumer_3.start();
        consumer_4.start();



    }
}
