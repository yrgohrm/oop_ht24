import java.util.function.*;

public class MetodRef {
    public static void main(String[] args) {
        String res = doStuffWithString("Apa", MetodRef::addHello);
        System.out.println(res);

        String res2 = doStuffWithString2("Apa", s -> "Hello " + s);
        System.out.println(res2);
    }

    private static String addHello(String str) {
        return "Hello " + str;
    }

    private static String doStuffWithString(String str, UnaryOperator<String> func) {
        // anropar str.toLowerCase() om vi skickade in String::toLowerCase
        return func.apply(str);
    }

    private static String doStuffWithString2(String str, StringModifier func) {
        // anropar str.toLowerCase() om vi skickade in String::toLowerCase
        return func.modify(str);
    }
}
