public class Rectangle {
    private int width;

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        if (width < 0) {
            this.width = 0;
        }
        else {
            this.width = width;
        }
    }

    
}
