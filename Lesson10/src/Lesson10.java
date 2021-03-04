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
        CashDesk cashDesk = new CashDesk();
        Consumer consumer_1 = new Consumer("consumer_1", cashDesk);
        Consumer consumer_4 = new Consumer("consumer_2", cashDesk);
        Consumer consumer_3 = new Consumer("consumer_3", cashDesk);
        Consumer consumer_2 = new Consumer("consumer_4", cashDesk);
        consumer_1.run();
        consumer_2.run();
        consumer_3.run();
        consumer_4.run();

    }
}
