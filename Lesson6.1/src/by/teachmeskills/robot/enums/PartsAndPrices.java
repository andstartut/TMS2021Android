package by.teachmeskills.robot.enums;

public enum PartsAndPrices {
    HEAD(1500),
    HAND(1100),
    LEG(900);
    private int partPrice;

    PartsAndPrices(int partPrice) {
        this.partPrice = partPrice;
    }

    public int getPartPrice() {
        return partPrice;
    }
}
