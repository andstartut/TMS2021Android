package store;

public class CashDesk {
    private String name;
    private int queue;

    public CashDesk(String name) {
        this.name = name;
    }

    public void joinTheQueue(Consumer consumer) {
        queue++;
        System.out.println(name + " : " + queue + " " + consumer.getName() + " consumers");
        if (getQueue() > 0) {
            getGoods(consumer);
        }
    }

    synchronized private void getGoods(Consumer consumer) {
        int countOfGoods = consumer.getGoods();
        while (countOfGoods > 0) {
            try {
                System.out.println("The " + consumer.getName() + " pays for the " + countOfGoods + " goods at the " + name);
                countOfGoods--;
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if (getQueue() > 0) {
            queue--;
            System.out.println(consumer.getName() + " is goes to the Exit");
            System.out.println("The queue to the " + name + " : " + queue + " consumers");
        }
    }


    public int getQueue() {
        return queue;
    }
}
