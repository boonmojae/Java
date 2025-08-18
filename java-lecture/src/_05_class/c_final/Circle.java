package _05_class.c_final;

import java.util.Scanner;

public class Circle {
    private final double radius;
    private static final double PI = Math.PI;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return PI * radius * radius;
    }

    public double getRadius() {
        return radius;
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("원의 반지름을 입력하세요: ");
        double inputRadius = scan.nextInt();
        Circle c1 = new Circle(inputRadius);
        System.out.println("원의 반지름: " + c1.getRadius());
        double area = c1.calculateArea();
        System.out.println("원의 넓이: " + area);

        scan.close();
    }
}
