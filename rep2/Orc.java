public class Orc implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("The orc eats you alive!");
        while (player.getLife() > 0) {
            System.out.println("Ouch!");
            player.wound();
        }
    }

    @Override
    public String getName() {
        return "an orc";
    }
    
}
