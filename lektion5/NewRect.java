public class NewRect {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle();
        rect.setHeight(10.2);
        rect.setWidth(20.7);
        rect.setColor("blue");

        rect.print();

        Rectangle redRectangle = new Rectangle();
        redRectangle.setHeight(1.0);
        redRectangle.setWidth(2.0);
        redRectangle.setColor("red");

        redRectangle.print();

        double redArea = redRectangle.area();
        System.out.println("Area: " + redArea);
    }
}
