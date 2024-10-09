public class ShapeMain {
    public static void main(String[] args) {
        
        Shape s = new Circle(13);

        doStuff(s);

    }

    private static void doStuff(Shape s) {
        System.out.println(s.area());

        if (s instanceof Rectangle) {
            Rectangle r = (Rectangle) s;
            r.flip();
        }
        else if (s instanceof Circle) {
            Circle c = (Circle) s;
            c.spin();
        }
    }
}
