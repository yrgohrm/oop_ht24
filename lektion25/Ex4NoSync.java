public class Ex4NoSync {
    private static int value = 0;

    private static class BadStuff implements Runnable {
        public void run() {
            for (int i = 0; i < 10; ++i) {
                value++;
                if (value % 2 == 0) {
                    System.out.println("The value is: " + value);
                    value++;
                }
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new BadStuff());
        Thread t2 = new Thread(new BadStuff());
        t1.start();
        t2.start();
        
        t1.join();
        t2.join();

        System.out.println("Should be 39: " + value);
    }
}
