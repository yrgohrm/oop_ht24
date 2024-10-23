import java.util.Scanner;

public class GameMain {
    public static void main(String[] args) {
        // we should only have one Scanner for System.in
        Scanner scan = new Scanner(System.in);
        
        String continueAnswer;

        do {
            guessingGame(scan);
            System.out.println("Vill du spela igen? (J/N)");
            continueAnswer = scan.next();
        } while (continueAnswer.toLowerCase().equals("j"));

    }   
    
    public static int guessingGame(Scanner scan) {
        GuessingGame gg = new GuessingGame();
        int res;
        do {
            System.out.println("Gissa vilket tal jag tänker på?");
            int guessedNumber = scan.nextInt();
            res = gg.guess(guessedNumber);
            if (res == 0) {
                System.out.println("Hurra du lyckades!");
            }
            else if (res < 0) {
                System.out.printf("Talet jag söker är större än %d.%n", guessedNumber);
            }
            else {
                System.out.printf("Talet jag söker är mindre än %d.%n", guessedNumber);
            }
        } while (res != 0);

        System.out.printf("Som bäst har du lyckats på %d gissningar.%n", gg.getBestNumberOfGuesses());
        System.out.printf("Som sämst har du lyckats på %d gissningar.%n", gg.getWorstNumberOfGuesses());

        return gg.getNumberOfGuesses();
    }
}
