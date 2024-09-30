public class GameMain {
    public static void main(String[] args) {
        GameDie d6 = new GameDie();
        GameDie d20 = new GameDie(20);

        for (int i = 0; i < 10000; i++) {
            d6.roll();
            d20.roll();
        }

        System.out.println("d6: " + d6.average());
        System.out.println("d20: " + d20.average());
    }
}
