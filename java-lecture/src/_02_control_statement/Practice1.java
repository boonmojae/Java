package _02_control_statement;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("숫자를 입력하세요");
        int number = scan.nextInt();

        for (int i=1; i<=number; i++) {
            System.out.print(i+ " ");
        }
        scan.close();
    }
}