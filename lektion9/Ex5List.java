import java.util.*;

public class Ex5List {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();

        myList.add("hej");
        myList.add("hopp");
        myList.add("alla");
        myList.add("glada");
        
        String first = myList.get(0);
        String last = myList.get(myList.size() - 1);
        
        System.out.println("Första och sista:");
        System.out.println(first + " " + last);
        System.out.println();

        myList.remove(0);
        
        System.out.println("Alla med första borttagen:");
        for (String str : myList) {
            System.out.println(str);
        }
    }
}
