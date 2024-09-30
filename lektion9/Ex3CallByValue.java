public class Ex3CallByValue {
    public static void function(int i) {
        i = 1;
    }
    
    public static void function(int[] i) {
        i[0] = 1;
    }
    
    public static void main(String[] args) {
        int value = 0;
        int[] array = { 0 };
        function(value);
        function(array);
        System.out.printf("%d %d \n", value, array[0]);
    }    
}
