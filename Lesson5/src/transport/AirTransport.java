package transport;

public class AirTransport extends Transport {
    private int lengthOfRunway;
    private float lengthOfTheWings;

    public AirTransport(int power, int maxSpeed, int weight, String brand, int lengthOfRunway, float lengthOfTheWings) {
        super(power, maxSpeed, weight, brand);
        this.lengthOfRunway = lengthOfRunway;
        this.lengthOfTheWings = lengthOfTheWings;
    }

    public int getLengthOfRunway() {
        return lengthOfRunway;
    }

    public void setLengthOfRunway(int lengthOfRunway) {
        this.lengthOfRunway = lengthOfRunway;
    }

    public float getLengthOfTheWings() {
        return lengthOfTheWings;
    }

    public void setLengthOfTheWings(float lengthOfTheWings) {
        this.lengthOfTheWings = lengthOfTheWings;
    }
}
