package _05_class;

public class Rectangle {

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int area(int width, int height) {
        return width * height;
    }
}
