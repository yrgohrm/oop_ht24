public class Ex2Thread {
    private static class Interruptable implements Runnable {
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Jobbar...");
            }

            System.out.println("Vänta lite bara...");

            try {
                Thread.currentThread().interrupted();
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

            System.out.println("Nu skall jag strax sluta.");
            System.out.println("När som helst...");
        }
    }

    public static void main(String[] args) 
                          throws InterruptedException {
        Thread t1 = new Thread(new Interruptable());
        t1.start();

        Thread.sleep(5000);
     
        t1.interrupt(); // tells the thread that it should quit
        t1.join(); // waits for it to exit

        System.out.println("Exiting main thread...");
    }
}
