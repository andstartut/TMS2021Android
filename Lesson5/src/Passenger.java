public class Passenger extends airTransport {
    private int passengerCapacity;
    private boolean businessClass;

    public Passenger(int power, int maxSpeed, int weight, String brand, int lengthOfRunway, float lengthOfTheWings, int passengerCapacity, boolean businessClass) {
        super(power, maxSpeed, weight, brand, lengthOfRunway, lengthOfTheWings);
    }

    public int getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(int passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    public void passengersAre(int passengers) {
        if (passengers <= getPassengerCapacity()) {
            System.out.println("The plane loaded");
        }else {
            System.out.println("The plane is full. You need another plane");
        }
    }

    @Override
    public String toString() {
        return "Passenger aircraft specifications: " +
                "passengerCapacity=" + passengerCapacity +
                ", businessClass=" + businessClass +
                ", brand='" + super.getBrand() + '\'' +
                ", max speed='" + super.getMaxSpeed() + "km/h" + '\'' +
                ", power='" + super.getPower() + "hp" + '\'' +
                ", power in kW='" + super.getPowerInKW() + "kW" + '\'' +
                ", weight='" + super.getWeight() + "kg" + '\'' +
                ", wheels='" + super.getLengthOfTheWings() + "m" + '\'' +
                ", wheels='" + super.getLengthOfRunway() + "km" + '\''
                ;
    }
}
