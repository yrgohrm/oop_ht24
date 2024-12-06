import java.util.stream.*;

public class Ex0ParallelStream {
    private static boolean isPrime(long num) {
        for (long i = 2; i <= num / 2; ++i) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        long time = System.nanoTime();

        var average = IntStream.range(2, 300000)
            .parallel()
            .filter(Ex0ParallelStream::isPrime)
            .average();


        long diff = System.nanoTime() - time;

        System.out.println("Time: " + (diff / 1_000_000) + " ms");

        System.out.println(average);

    }
}
