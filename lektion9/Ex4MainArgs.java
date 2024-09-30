public class Ex4MainArgs {
    public static void main(String[] args) {
        for (String arg : args) {
            if (arg.equals("-l")) {
                System.out.println("lalalala!");
            }
            else if (arg.equals("bosse")) {
                System.out.println("Bosse Bredsladd in the house!");
            }
            else {
                System.out.println(arg);
            }
        }
    }        
}
