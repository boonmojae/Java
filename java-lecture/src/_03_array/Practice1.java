package _03_array;

import java.util.Scanner;

public class Practice1 {
    public static void main(String[] args) {
        System.out.println("5개의 정수를 입력하세요");
        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[5];

        for(int i = 0; i < 5; i++) {
            numbers[i] = scan.nextInt();
        }

        System.out.println("평균은 " + average(numbers));
        scan.close();
    }

    public static double average(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum / 5.0;
    }
}
