import java.util.*;

public class VarDecl {
    private static Map<List<String>, Set<Integer>> getHorribleType() {
        return Map.of(
            List.of("apa", "bepa"),
            Set.of(1, 2, 3),
            List.of("foo", "bar"),
            Set.of(4, 5, 6)
        );
    }

    public static void main(String[] args) {
        var myStuff = 22;
        var aList = new ArrayList<String>();
        var someText = "Hejsan hoppsan";
        var complexType = getHorribleType();


        System.out.println(myStuff);
        System.out.println(aList);
        System.out.println(someText);
        System.out.println(complexType);

        System.out.println("\n----\n");

        System.out.println(myStuff + 10);
        System.out.println(aList.size());
        System.out.println(someText.trim());
        System.out.println(complexType.values());
    }
}
