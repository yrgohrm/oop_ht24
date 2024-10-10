public class Triangle extends Shape {
    private int width;
    private int height;

    public Triangle(int width, int height) {
        super("Triangle");
        this.width = width;
        this.height = height;
    }

    @Override
    public String toString() {
        return "width=" + width
                + ", height=" + height
                + ", name=" + super.toString();
    }

    public double area() {
        return width * height / 2.0;
    }
}
