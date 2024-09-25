import java.io.PrintStream;

public class Rectangle {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void print() {
        System.out.println("print()");
        print(System.out);
    }

    void print(PrintStream ps) {
        ps.printf("w: %.2f, h: %.2f\n", width, height);
    }

    public void print(int num) {
        System.out.println("print(int)");
        for (int i = 0; i < num; ++i) {
            print();
        }
    }

    public void print(int num, int space) {
        System.out.println("print(int, int)");
        for (int i = 0; i < num; ++i) {
            print();
            System.out.println();
        }
    }
}

