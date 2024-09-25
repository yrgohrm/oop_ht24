public class Example1 {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(123, 456);

        rect.print();
        rect.print(System.err);
        rect.print(3);
        rect.print(3, 2);
    }
}
