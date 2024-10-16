public class Ex1Fac {
    /**
     * Calculates the facutly 1*2*...*n
     * 
     */
    public static int fac(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n must be 1 or greater");
        }

        if (n == 0) {
            return 1;
        }
        else {
            return n * fac(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(fac(-1));
    }
}
