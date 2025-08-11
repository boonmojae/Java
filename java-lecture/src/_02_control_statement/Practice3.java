package _02_control_statement;

public class Practice3 {
    public static void main(String[] args) {

        System.out.println("반지름이 5인 원의 넓이: " + area(5));
        System.out.println("가로 4, 세로 7인 직사각형의 넓이: " + area(4, 7));
        System.out.println("밑변 6, 높이 3인 삼각형의 넓이: " + area(6, 3, 2));
    }

    public static double area(double r) {
        return r * r * 3.14;
    }

    public static double area(double width, double height) {
        return width * height;
    }

    public static double area(double width, double height, double div) {
        return (width * height) / 2;
    }
}
