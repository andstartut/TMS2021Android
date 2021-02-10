public class Military extends airTransport {
    private boolean ejectSystem;
    private int countOfMissiles;

    public Military(int power, int maxSpeed, int weight, String brand, int lengthOfRunway, float lengthOfTheWings, boolean ejectSystem, int countOfMissiles) {
        super(power, maxSpeed, weight, brand, lengthOfRunway, lengthOfTheWings);
        this.countOfMissiles = countOfMissiles;
        this.ejectSystem = ejectSystem;
    }

    public boolean isEjectSystem() {
        return ejectSystem;
    }

    public void setEjectSystem(boolean ejectSystem) {
        this.ejectSystem = ejectSystem;
    }

    public int getCountOfMissiles() {
        return countOfMissiles;
    }

    public void setCountOfMissiles(int countOfMissiles) {
        this.countOfMissiles = countOfMissiles;
    }

    public void fire() {
        if (getCountOfMissiles() != 0) {
            System.out.println("The missile launched");
        }else {
            System.out.println("None");
        }
    }

    public void ejectSystem() {
        if (ejectSystem) {
            System.out.println("The eject was successful");
        }else {
            System.out.println("You haven't this system");
        }
    }

    @Override
    public String toString() {
        return "Military aircraft specifications: " +
                "ejectSystem=" + ejectSystem +
                ", countOfMissiles=" + countOfMissiles +
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
