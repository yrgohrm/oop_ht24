public class Ex4 {
    public static void main(String[] args) {
        try {
            if (Math.random() < 7) {
                throw new IllegalArgumentException();
            }
        }
        catch (IllegalArgumentException ex) {
            System.err.println("Oops, det gick illa: " + ex.getMessage());
        }
    }
}
