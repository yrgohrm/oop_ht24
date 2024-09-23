public class Player {
    private String name;
    private int highScore;

    public Player(String name) {
        this.name = name;
        this.highScore = 0;
    }

    public void newScore(int score) {
        if (score > highScore) {
            highScore = score;
        }
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }
}
