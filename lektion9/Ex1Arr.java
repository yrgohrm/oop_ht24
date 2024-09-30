import java.awt.geom.Point2D;

public class Ex1Arr {
    public static void main(String[] args) {
        int[] intArray = new int[100];
        int[] intArray2 = {1, 2, 3, 4, 99, 100};
        Point2D[] pointArray = new Point2D[5];

        // old way of looping
        for (int i = 0; i < intArray2.length; ++i) {
            System.out.println(intArray2[i]);
        }


        System.out.println("New loop:");
        for (int i : intArray2) {
            System.out.println(i);
        }

        intArray[5] = 9;

        for (int i : intArray) {
            System.out.print(i + " ");
        }

        // "new" way of looping
        for (Point2D point : pointArray) {
            System.out.println(point); // skriver ut null
        }

        // works for any kind of array (and list)
        // for (int i : intArray) {
        //     System.out.print(i + " ");
        // }
    }
}
