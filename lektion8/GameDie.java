import java.util.concurrent.*;

public class GameDie {
    private int sides;
    private long sumOfRolls;
    private int numberOfRolls;

    public GameDie() {
        this(6);
    }

    public GameDie(int sides) {
        this.sides = sides;
        this.sumOfRolls = 0;
        this.numberOfRolls = 0;
    }
 
    public int roll() {
        int result = ThreadLocalRandom.current().nextInt(1, sides + 1);
        
        numberOfRolls++;
        sumOfRolls += result;

        return result;
    }

    public double average() {
        return sumOfRolls / (double) numberOfRolls;
    }
}
