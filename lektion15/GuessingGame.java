import java.util.concurrent.ThreadLocalRandom;

/**
 * A simple game for guessing a random number between 1 and 10.
 */
public class GuessingGame {
    private static int bestNumberOfGuesses = Integer.MAX_VALUE;
    private static int worstNumberOfGuesses = 0;
    
    private int secretNumber;
    private int numberOfGuesses;

    public GuessingGame() {
        // this is actually the correct way to get a random number
        // if we don't need a cryptographically secure random number
        secretNumber = 1 + ThreadLocalRandom.current().nextInt(10);
        numberOfGuesses = 0;
    }

    /**
     * Make a guess. Will increase the number of guesses and return an int 
     * depending on your guess. -1 if your guess was smaller, 0 if it was
     * correct and 1 if your guess was too big.
     * 
     * @param guess your guess
     * @return your guess was smaller (-1), correct (0) or bigger (1)
     */
    public int guess(int guess) {
        numberOfGuesses++;

        if (guess == secretNumber) {
            // this is not safe to do in a multithreaded environment...
            // more on that in a later lecture

            if (numberOfGuesses < bestNumberOfGuesses) {
                bestNumberOfGuesses = numberOfGuesses;
            }

            if (numberOfGuesses > worstNumberOfGuesses) {
                worstNumberOfGuesses = numberOfGuesses;
            }

            return 0;
        }
        else if (guess < secretNumber) {
            return -1;
        }

        return 1;
    }

    /**
     * The total number of guesses made.
     * @return 0 or more guesses that gave been made.
     */
    public int getNumberOfGuesses() {
        return numberOfGuesses;
    }

    public static int getBestNumberOfGuesses() {
        return bestNumberOfGuesses;
    }

    public static int getWorstNumberOfGuesses() {
        return worstNumberOfGuesses;
    }
}
