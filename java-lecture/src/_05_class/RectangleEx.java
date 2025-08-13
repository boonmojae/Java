package _05_class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {

        ArrayList<Rectangle> list = new ArrayList<>();
        Scanner scan = new Scanner(System.in);

        try {
            while (true) {
                System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
                int w = scan.nextInt();
                int y = scan.nextInt();

                if (w == 0 && y == 0) {
                    break;
                }

                Rectangle rectangle = new Rectangle(w);
                rectangle.setHeight(y);
                list.add(rectangle);
            }

//            for (int i = 0; i < list.size(); i++) {
//                Rectangle rt = list.get(i);
//                System.out.println("가로 길이는: " + rt.getWidth());
//                System.out.println("세로 길이는: " + rt.getHeight());
//                System.out.println("넓이는: " + rt.area());
//                System.out.println("--------------------");
//            }

            for (Rectangle element : list) {
                System.out.println("가로 길이는: " + element.getWidth());
                System.out.println("세로 길이는: " + element.getHeight());
                System.out.println("넓이는: " + element.area());
                System.out.println("--------------------");
            }

        } catch (IllegalArgumentException | NegativeArraySizeException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
            System.out.println(e.getMessage());
        }
        scan.close();
    }
}
