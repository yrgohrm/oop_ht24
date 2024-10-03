public class Mirror implements Interactive {

    @Override
    public void interact(Player player) {
        System.out.println("You see " + player.getName() + " in the mirror.");
    }

    @Override
    public String getName() {
        return "a mirror";
    }
    
}
