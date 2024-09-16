/**
 * A rectangle to keep track of bla bla bla bla.
 * 
 * Very important to use in conjuction with bla bla bla.
 */
public class Rectangle {
    private double height;
    private double width;
    private String color;

    /**
     * Prints the basic information for this rectangle.
     * Prints on standard output.
     * 
     */
    public void print() {
        System.out.println("Rectangle:");
        System.out.printf("\theight: %.2f%n", height);
        System.out.printf("\twidth:  %.2f%n", width);
        System.out.printf("\tcolor:  %s%n", color);
    }

    /**
     * Sets the rectangles height. It must 
     * be less than 1000 due to bla bla bla
     * 
     * @param height the height
     */
    public void setHeight(double height) {
        if (height < 1000) {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double area() {
        double theArea = height * width;
        return theArea;
    }
}
