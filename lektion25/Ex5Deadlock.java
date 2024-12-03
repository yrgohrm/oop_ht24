import java.util.*;

public class Ex5Deadlock {
    private static List<String> lOne = new ArrayList<>();
    private static List<String> lTwo = new ArrayList<>();

    private static class Sync1 implements Runnable {
        public void run() {
            synchronized (lOne) {

                // sleep();
                System.out.println("Hello Sync1 first");
                
                synchronized (lTwo) {
                    System.out.println("Hello Sync1 second");

                    lOne.add("hej");
                    lTwo.add("hej");
                }
            }
        }
    }
    
    private static class Sync2 implements Runnable {
        public void run() {
            synchronized (lTwo) {

                // sleep();
                System.out.println("Hello Sync2 first");

                synchronized (lOne) {
                    System.out.println("Hello Sync2 second");

                    lOne.add("hej");
                    lTwo.add("hej");
                }
            }
        }
    }
    
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new Sync1());
        Thread t2 = new Thread(new Sync2());

        t1.start();
        t2.start();
        
        t1.join();
        t2.join();
    }

    private static void sleep() {
        try {
            Thread.sleep(500);
        }
        catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }
}
