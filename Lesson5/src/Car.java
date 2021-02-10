public class Car extends groundTransport {
    private int capacity;
    private CarBody carBody;

    public Car(int power, int maxSpeed, int weight, String brand, int countOfWheels, float fuelConsumption, CarBody carBody) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.carBody = carBody;
        setCapacity();
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity() {
        switch (carBody) {
            case SEDAN:
                this.capacity = CarBody.SEDAN.getCapacitty();
                break;
            case WAGON:
                this.capacity = CarBody.WAGON.getCapacitty();
                break;
            case PICKUP:
                this.capacity = CarBody.PICKUP.getCapacitty();
                break;
            case CABRIOLET:
                this.capacity = CarBody.CABRIOLET.getCapacitty();
                break;
            case COUPE:
                this.capacity = CarBody.COUPE.getCapacitty();
                break;
        }

    }

    public CarBody getBody() {
        return carBody;
    }

    public void setBody(CarBody carBody) {
        this.carBody = carBody;
    }

    public void getMaxDistance(float time) {
        float maxDistance = getMaxSpeed() * time;
        float fuelSpend = (maxDistance * getFuelConsumption()) / 100;
        System.out.println("За время " + time +
                " ч, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + maxDistance +
                " км и израсходует " + fuelSpend +
                " литров топлива.");
    }

    @Override
    public String toString() {
        return "Car specifications : " +
                "capacity=" + capacity +
                ", body='" + carBody + '\'' +
                ", brand='" + super.getBrand() + '\'' +
                ", max speed='" + super.getMaxSpeed() + "km/h" + '\'' +
                ", power='" + super.getPower() + "hp" + '\'' +
                ", power in kW='" + super.getPowerInKW() + "kW" + '\'' +
                ", weight='" + super.getWeight() + "kg" + '\'' +
                ", weight='" + super.getFuelConsumption() + "l/100km" + '\'' +
                ", wheels='" + super.getCountOfWheels() + '\''
                ;
    }
}
