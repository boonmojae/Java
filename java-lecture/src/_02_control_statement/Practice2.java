package _02_control_statement;

import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        System.out.println("숫자 두 개를 입력하세요.");
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();

        System.out.println("덧셈 결과: " + sum(a,b));
        System.out.println("뺄셈 결과: " + sub(a,b));
        System.out.println("나눗셈 결과: " + mul(a,b));
        System.out.println("곱셈 결과: " + div(a,b));
    }

    public static double sum(int a, int b ) {
        return a + b;
    }

    public static double sub(int a, int b) {
        return a - b;
    }

    public static double mul(int a, int b ) {
        return a * b;
    }

    public static double div(int a, int b) {
        return a / b;
    }
}
