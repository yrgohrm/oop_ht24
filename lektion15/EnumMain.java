public class EnumMain {
    public static void main(String[] args) {
        int value = Suit.CLUBS.ordinal();
        System.out.println(value);

        Suit[] data = Suit.values();
        for (Suit suit : data) {
            System.out.println(suit);
        }
    }
}
