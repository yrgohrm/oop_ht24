package cars;

public class RaceTrack {
    public static void main(String[] args) {
        // FordSMax smax = new FordSMax();
        // testRun(smax);

        Driveable chiron = new BugattiChiron();
        testRun(chiron);
    }

    private static void testRun(Driveable car) {
        car.shiftGear(1);
        car.accelerate(10);
        car.shiftGear(2);
        car.accelerate(20);
        car.shiftGear(4);
        car.accelerate(20);
        car.decelerate(30);
        car.shiftGear(2);
        car.turn(-20);
        car.turn(40);
        car.accelerate(20);
        car.shiftGear(4);
        car.accelerate(20);
        car.decelerate(1000);
    }
}
