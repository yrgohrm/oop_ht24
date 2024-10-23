import java.util.*;

public class AnnotationEx {
    @Deprecated
    public static void doBadStuff() {
        System.out.println("hahahaha");
    }

    @SuppressWarnings({"unchecked", "java:S3740"})
    public void strangeStuff() {
        List data = new ArrayList();
        data.add("hejsan");
        String str = (String) data.get(0);
        System.out.println(str);
    }


    public static void main(String[] args) {
        AnnotationEx.doBadStuff();
    }
}
