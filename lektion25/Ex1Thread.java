import java.util.concurrent.ThreadLocalRandom;

public class Ex1Thread {
    private static class PrintRunner implements Runnable {
        private int num;

        public PrintRunner(int num) {
            this.num = num;
        }

        public void run() {
            for (int i = 0; i < 200; ++i) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        PrintRunner pr1 = new PrintRunner(1);
        PrintRunner pr2 = new PrintRunner(2);

        Thread t1 = new Thread(pr1, "foobar"); // vilken kod vi skall köra
        Thread t2 = new Thread(pr2); // vilken kod vi skall köra
        Thread t3 = new Thread(() -> {
            System.out.println("hahahahaha!");
        });

        t1.start(); // och kör den! startar första tråden
        t2.start(); // och kör den! startar andra tråden
        t3.start();

        for (int i = 0; i < 200; ++i) {
            System.out.print("3 ");
        }
    }
}
