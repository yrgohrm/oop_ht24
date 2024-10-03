public class WaterGun implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("You squirt water at an orc. It gets really mad!");
        player.wound();
        player.wound();
    }

    @Override
    public String getName() {
        return "a water gun";
    }
    
}
