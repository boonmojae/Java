package _05_class;

import java.util.Scanner;

public class RectangleEx {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("사각형의 가로와 세로 길이를 띄어쓰기를 기준으로 입력해주세요.");
        int w = scan.nextInt();
        int h = scan.nextInt();

        Rectangle r1 = new Rectangle(w, h);

        System.out.println(r1.area(w,h));
    }
}
