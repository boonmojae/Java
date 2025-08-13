package _04_exception;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice2_1 {
    public static void main(String[] args) {

            // 배열의 크기 입력 >> 정수형으로 입력받기
            Scanner scan = new Scanner(System.in);
            System.out.println("배열의 크기를 입력해주세요.");
        try {
            int arrayLength = scan.nextInt(); // 예외 발생 가능
            int[] array = new int[arrayLength];

            if (arrayLength == 0) {
                throw new IllegalArgumentException("0은 입력값으로 올 수 없습니다.");
            }

            // 배열 요소의 평균 구하기
            // 배열에 요소 넣기
            int sum = 0;
            for (int i = 0; i<arrayLength; i++) {
                System.out.print("요소를 입력하세요 ");
                int element = scan.nextInt();
                array[i] = element;
                sum += element;
            }

            System.out.println(Arrays.toString(array));
            double avg = (double)sum/arrayLength;
            System.out.println("평균: " + avg);

        } catch (InputMismatchException e) {
            System.out.println(e.getMessage());
            System.out.println("숫자를 입력해주세요");
        } catch (NegativeArraySizeException | IllegalArgumentException e) { // catch를 하나 더 생성하지 않고 | 로 두개예외 처리
            System.out.println(e.getMessage());
            System.out.println("양수를 입력해주세요");
        } finally {
            scan.close();
        }

    }
}
