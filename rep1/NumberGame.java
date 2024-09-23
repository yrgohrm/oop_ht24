import java.util.*;

public class NumberGame {
    private Highscore highScore;
    private Player player1;
    private Player player2;

    public NumberGame() {
        highScore = new Highscore();
    }

    public void play() {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        System.out.println("Vad heter spelare ett?");
        String playerOneName = input.nextLine();

        System.out.println("Vad heter spelare två?");
        String playerTwoName = input.nextLine();

        this.player1 = new Player(playerOneName);
        this.player2 = new Player(playerTwoName);

        for (int i = 0; i < 4; i++) {
            oneQuestion(input, random, player1);        
            oneQuestion(input, random, player2);        
        }

        System.out.printf("Highscore: %s med %d poäng.%n", highScore.getName(), highScore.getHighScore());
        System.out.printf("%s fick som bäst %d poäng.%n", player1.getName(), player1.getHighScore());
        System.out.printf("%s fick som bäst %d poäng.%n", player2.getName(), player2.getHighScore());
    }

    private void oneQuestion(Scanner input, Random random, Player player) {
        System.out.printf("Är du beredd %s? Tryck enter.%n", player.getName());
        input.nextLine();

        int num1 = random.nextInt(1, 10);
        int num2 = random.nextInt(1, 10);
        int num3 = random.nextInt(1, 10);

        long startTime = System.currentTimeMillis();

        System.out.printf("%d * %d + %d%n", num1, num2, num3);
        int answer = input.nextInt();
        input.nextLine();

        long endTime = System.currentTimeMillis();
        int answerTime = (int)((endTime - startTime) / 1000);
        int points = 10 - answerTime;

        int correctAnswer = num1 * num2 + num3;

        if (answer == correctAnswer) {
            System.out.printf("Rätt! Du fick %d poäng.%n", points);
            player.newScore(points);
            highScore.newScore(player.getName(), points);
        }
        else {
            System.out.println("Fel!");
        }
    }
}
