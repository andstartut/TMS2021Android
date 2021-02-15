package by.teachmeskills.robot.legs;

public class SonyLeg implements ILeg{
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void step() {
        System.out.println("Шаг ногой Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
