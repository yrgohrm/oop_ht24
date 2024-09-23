public class Highscore {
    private String name;
    private int highScore;

    public Highscore() {
        this.name = "";
        this.highScore = 0;
    }

    public void newScore(String name, int score) {
        if (score > highScore) {
            this.name = name;
            this.highScore = score;
        }
    }

    public String getName() {
        return name;
    }

    public int getHighScore() {
        return highScore;
    }

    
}
