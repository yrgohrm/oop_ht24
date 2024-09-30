public class Ex7StringBuilder {
    public static void main(String[] args) {
        // the bad way to do it
        String resString = "";
        for (int i = 0; i < 100; ++i) {
            // don't append in a loop, it will create a lot of intermediate strings
            resString += i + " ";
        }
        System.out.println(resString);

        // the good way to do it
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100; ++i) {
            builder.append(i).append(" ");
        }
        String res = builder.toString();
        System.out.println(res);
    }
}
