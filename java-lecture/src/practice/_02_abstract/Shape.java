package practice._02_abstract;

public abstract class Shape {

    String color;
    String type;

    public Shape(String color, String type) {
        this.color = color;
        this.type = type;
    }

    public abstract double calculateArea();

    public String getType() {
        return this.type;
    }
    public String getColor() {
        return this.color;
    }
}
