package enums;

public enum ProductType {
    SEDAN("sedan"),
    WAGON("wagon"),
    COUPE("coupe"),
    PICKUP("pickup"),
    SUV("SUV"),
    VAN("VAN"),
    SPORTCAR("sportcar"),
    RACE("race");
    String type;

    ProductType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
