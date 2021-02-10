public abstract class groundTransport extends Transport {
    private int countOfWheels;
    private float fuelConsumption;

    public groundTransport(int power, int maxSpeed, int weight, String brand, int countOfWheels, float fuelConsumption) {
        super(power, maxSpeed, weight, brand);
        this.countOfWheels = countOfWheels;
        this.fuelConsumption = fuelConsumption;
    }

    public int getCountOfWheels() {
        return countOfWheels;
    }

    public void setCountOfWheels(int countOfWheels) {
        this.countOfWheels = countOfWheels;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
