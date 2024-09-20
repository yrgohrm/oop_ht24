public class Rectangle {
    private double height;
    private double width;
    private String color;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
        this.color = "pink";
    }

    public Rectangle(double length) {
        this.height = length;
        this.width = length;
        this.color = "yellow";
    }

    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // public static void main(String[] args) {
    //     Rectangle r = new Rectangle();
    //     System.out.println(r);
    //     Rectangle r2 = new Rectangle();
    //     System.out.println(r2);
    // }
}
