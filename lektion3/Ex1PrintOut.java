public class Ex1PrintOut {
    public static void main(String[] args) {
        System.out.println("Talet PI med massor av decimaler: " + Math.PI);
        System.out.printf("Talet PI med två decimaler: %.2f%n", Math.PI);

        int i = 1, j = 12, k = 123;
        System.out.println("Högerjusterad 14 tecken:");
        System.out.printf("%14d%n%14d%n%14d",i, j, k);
    }
}
