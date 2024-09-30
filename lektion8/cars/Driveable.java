package cars;

public interface Driveable {
    void turn(double angle);

    void accelerate(int amount);

    void decelerate(int amount);

    void shiftGear(int gear);
}
