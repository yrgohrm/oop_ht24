import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;
import java.util.stream.IntStream;

public class Ex5RangeSum extends RecursiveTask<Integer> {
    private final int from;
    private final int to;

    public Ex5RangeSum(int from, int to) {
        this.from = from;
        this.to = to;
    }

    @Override
    protected Integer compute() {
        if (to-from < 100) {
            System.out.println("Compute");
            return IntStream.range(from, to+1).sum();
        }
        else {
            System.out.println("Split");
            int split = (to-from)/2;
            Ex5RangeSum part1 = new Ex5RangeSum(from, from+split);
            Ex5RangeSum part2 = new Ex5RangeSum(from+split+1, to);
            Integer sum1 = part1.invoke();
            Integer sum2 = part2.invoke();
            return sum1 + sum2;
        }
    }
    
    public static void main(String[] args) {
        int v = ForkJoinPool.commonPool().invoke(new Ex5RangeSum(987, 5436));
        System.out.println(v);
    }
}
