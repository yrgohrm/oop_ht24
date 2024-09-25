public class RentalItem {
    private static double basePrice = 40;
    private double itemPrice;
    private String name;

    public RentalItem(String name, double itemPrice) {
        this.name = name;
        this.itemPrice = itemPrice;
    }

    public String getName() {
        return name;
    }

    public double pricePerDay() {
        return basePrice + itemPrice;
    }

    public static void setBasePrice(double newBasePrice) {
        basePrice = newBasePrice;
    }
}
