public class RentalMain {
    public static void main(String[] args) {
        RentalItem hammer = new RentalItem("Hammer", 10);
        RentalItem lift = new RentalItem("Lift", 2500);
        RentalItem saw = new RentalItem("Saw", 50);

        System.out.printf("%s kostar %f per dag.%n", hammer.getName(), hammer.pricePerDay());
        System.out.printf("%s kostar %f per dag.%n", lift.getName(), lift.pricePerDay());
        System.out.printf("%s kostar %f per dag.%n", saw.getName(), saw.pricePerDay());
        
        saw.setBasePrice(1200);
        
        System.out.printf("%s kostar %f per dag.%n", hammer.getName(), hammer.pricePerDay());
        System.out.printf("%s kostar %f per dag.%n", lift.getName(), lift.pricePerDay());
        System.out.printf("%s kostar %f per dag.%n", saw.getName(), saw.pricePerDay());
    }
}
