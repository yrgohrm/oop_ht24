public class SimpleThreads {
    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new Thread(SimpleThreads::doStuff, "Bosse");
        t1.start();


        t1.join();
        
        for (int i = 0; i < 10000; i++) {
            System.out.println("World!");
        }
    }

    private static void doStuff() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("Hello!");
        }
    }
}
