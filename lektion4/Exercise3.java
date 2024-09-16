public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 2147483640; i <= 2147483647; ++i) {
            System.out.println(i);

            if (i == 2147483647) {
                break;
            }
        }
    }
}
