public class Example2 {
    public static void main(String[] args) {
        Rectangle data = new Rectangle();
        data.setColor("purple");
        foo(data);
        data.print();
    }

    private static void foo(Rectangle i) {
        i.setColor("red");
    }
}
