package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.println("배열 크기를 입력해주세요.");
            int size = scan.nextInt();

            if (size == 0) {
                throw new ArithmeticException();
            }

            int[] array = new int[size];

            int sum = 0;

            for (int i = 0; i < size; i++) {
                System.out.println("요소를 입력해주세요.");
                array[i] = scan.nextInt();
                sum += array[i];
            }

            System.out.println((double) sum / size);

        } catch (InputMismatchException e) {
            System.out.println("숫자를 입력해주세요.");
        } catch (ArithmeticException e) {
            System.out.println("0으로 나눌 수 없습니다.");
        } catch (NegativeArraySizeException e) {
            System.out.println("양수를 입력해주세요.");
        }
    }
}
