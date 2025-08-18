package practice._02_abstract;

import java.util.ArrayList;
import java.util.List;

public class ShapeEx {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        Circle cir = new Circle("Red", "circle", 5.0);
        shapes.add(cir);
        Rectangle rectangle = new Rectangle("Blue", "rectangle", 6.0, 4.0);
        shapes.add(rectangle);
        System.out.println();
        for (Shape s : shapes) {
            System.out.println("====== " + s.getType() + " 도형의 정보 ======");
            System.out.println("도형의 색상: " + s.getColor());
            System.out.println("도형의 넓이: " + s.calculateArea());
            System.out.println();
        }
    }
}
