package enums;

public enum CarBody {
    SEDAN (5),
    WAGON(7),
    PICKUP(4),
    COUPE(2),
    CABRIOLET(4);
private int capacitty;

    CarBody(int capacitty) {
        this.capacitty = capacitty;
    }

    public int getCapacitty() {
        return capacitty;
    }
}
