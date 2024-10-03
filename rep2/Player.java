public class Player {
    private String name;
    private int life;

    public Player(String name) {
        this.name = name;
        this.life = 10;
    }

    public String getName() {
        return name;
    }

    public int getLife() {
        return life;
    }

    public void wound() {
        if (life > 0) {
            life--;
        }
    }

    public void heal() {
        if (life < 10) {
            life++;
        }
    }
}
