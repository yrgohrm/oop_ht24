public class PairStuff {
    record StringAndInt(String o1, int o2) {}
    record TwoValues(Object o1, Object o2) {}

    private static StringAndInt getStuff() {
        return new StringAndInt("Hejsan", 22);
    }

    private static TwoValues getBadStuff() {
        return new TwoValues("Hejsan", "22");
    }

    public static void main(String[] args) {
        StringAndInt res1 = getStuff();

        System.out.println(res1.o1.length());
        System.out.println(res1.o2 * 3);

        TwoValues res2 = getBadStuff();

        System.out.println(((String)res2.o1).length());
        System.out.println(((Integer)res2.o2) * 3);
    }
}
