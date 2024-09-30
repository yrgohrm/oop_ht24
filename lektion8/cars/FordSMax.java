package cars;

public class FordSMax implements Driveable {

    private int fuelLevel = 5;

    @Override
    public void turn(double angle) {
        System.out.println("svääänger " + angle);
    }

    @Override
    public void accelerate(int amount) {
        if (fuelLevel > 0) {
            System.out.println("brum brum");
            fuelLevel--;
        }
    }

    @Override
    public void decelerate(int amount) {
        System.out.println("brooooms");

    }

    @Override
    public void shiftGear(int gear) {
        System.out.println("Växlar till " + gear);
    }

    public int getFuelAmount() {
        return fuelLevel;
    }
}
