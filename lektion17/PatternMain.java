public class PatternMain {
    public static void main(String[] args) {
        record Pair(Object x, Object y) {};

        Pair foo = new Pair("Hej", "Hallå");
        System.out.println(foo);

        // Pair bar = new Pair(12.23, "Nisse");
        // System.out.println(bar);

        if (foo instanceof Pair(String s, String t)) {
            System.out.println(s + " " + t);
        }
        else {
            System.out.println("Inte två strängar");
        }
    }
}
