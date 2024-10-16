public class FinallyEx {
    public static void main(String[] args) {
        
        try {
            if (Math.random() < 0.999999)
                throw new IllegalArgumentException();

            System.out.println("Hejsanhoppsan 1");
        }
        catch (IllegalArgumentException ex) {
            System.out.println("Vi fångade ett fel");
        }
        finally {
            System.out.println("I finally");
        }

        System.out.println("Hejsanhoppsan 2");
    }
}
