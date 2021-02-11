package transport;

public class Truck extends GroundTransport {
    private float payload;

    public Truck(int power, int maxSpeed, int weight, String brand, float payload, int countOfWheels, float fuelConsumption) {
        super(power, maxSpeed, weight, brand, countOfWheels, fuelConsumption);
        this.payload = payload;
    }

    public float getPayload() {
        return payload;
    }

    public void setPayload(float payload) {
        this.payload = payload;
    }

    public void weightIs(int weight) {
        if (weight <= getPayload()) {
            System.out.println("The truck loaded");
        }else {
            System.out.println("The truck is full. You need one more truck");
        }
    }

    @Override
    public String toString() {
        return "transport.Truck specifications : " +
                "payload=" + payload + "t" +
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
