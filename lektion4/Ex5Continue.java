
public class Ex5Continue {
    public static void main(String[] args) {
        for (int i = 1; i < 20; ++i) {
            // Don't print numbers divisible by 3 or 5.
            if (i % 3 == 0 || i % 5 == 0) {
                continue;
            }

            System.out.printf("%d\n", i);
        }
    }
}
