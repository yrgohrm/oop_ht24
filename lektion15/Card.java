public class Card {
    private int value;
    private Suit suit;

    public Card(int value, Suit suit) {
        if (value < 1 || value > 13) {
            throw new IllegalArgumentException("not a valid card");
        }
        
        this.value = value;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return "Card [value=" + value + ", suit=" + suit + "]";
    }
}
