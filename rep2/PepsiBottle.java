public class PepsiBottle implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("It tastes great!");
        player.heal();
    }

    @Override
    public String getName() {
        return "a pepsi bottle";
    }
}
