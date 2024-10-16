public class Ex7 {
    public static void main(String[] args) {
        try {
            throw new IllegalArgumentException();
        }
        catch (IllegalArgumentException ex) {
            System.out.println("In catch");
        }
        finally {
            System.out.println("After try and catch");
        }
    }
}
