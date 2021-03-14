package enums;

public enum Goods {
    BANANA(4),
    BREAD(2),
    EGGS(3),
    PASTA(5),
    BEEF(15),
    MILK(2),
    POTATOES(3),
    FISH(12),
    CHICKEN(7),
    CHEESE(17),
    TOMATOES(6);
    private int price;

    Goods(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
