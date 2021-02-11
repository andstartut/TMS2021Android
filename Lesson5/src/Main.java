import enums.CarBody;
import transport.Car;
import transport.Military;
import transport.Passenger;
import transport.Truck;

public class Main {
    public static void main(String[] args) {
        Car audi100 = new Car(
                100,
                230,
                1500,
                "Audi",
                4,
                8,
                CarBody.SEDAN);
        System.out.println(audi100.toString());
        audi100.getMaxDistance(2.5F);

        Truck iveco = new Truck(
                100,
                120,
                2500,
                "Iveco",
                3,
                6,
                20
        );
        iveco.weightIs(5);

        Passenger boeing737NG = new Passenger(
                7000,
                900,
                10000,
                "Boeing",
                5,
                34,
                100,
                false
        );
        boeing737NG.passengersAre(121);

        Military f22 = new Military(
                10000,
                2400,
                6,
                "Lockheed Martin",
                1,
                14,
                true,
                4
        );
        f22.fire();
        f22.ejectSystem();
    }
}
