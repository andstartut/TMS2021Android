package transport;

import enums.CarBody;

import static enums.CarBody.*;

public class Car extends GroundTransport {
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
                this.capacity = SEDAN.getCapacitty();
                break;
            case WAGON:
                this.capacity = WAGON.getCapacitty();
                break;
            case PICKUP:
                this.capacity = PICKUP.getCapacitty();
                break;
            case CABRIOLET:
                this.capacity = CABRIOLET.getCapacitty();
                break;
            case COUPE:
                this.capacity = COUPE.getCapacitty();
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
        System.out.println("За время " + time +
                " ч, автомобиль " + getBrand() +
                " двигаясь с максимальной скоростью " + getMaxSpeed() +
                " км/ч проедет " + maxDistance +
                " км и израсходует " + fuelSpend(maxDistance) +
                " литров топлива."
        );
    }

    private float fuelSpend(float maxDistance) {
        return (maxDistance * getFuelConsumption()) / 100;
    }

    @Override
    public String toString() {
        return "transport.Car specifications : " +
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
