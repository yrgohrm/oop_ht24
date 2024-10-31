import java.util.*;

public class SetEx {
    public static void main(String[] args) {
        Set<String> data = new HashSet<>();
        data.add("Hejsan");
        data.add("Hoppsan");
        data.add("Hejsan");

        for (String value : data) {
            System.out.println(value);
        }

        List<String> dataList = new ArrayList<>(data);
        dataList.add("Hejsan");

        System.out.println(dataList);

        Set<String> cleanData = new HashSet<>(dataList);
        System.out.println(cleanData);
    }
}
