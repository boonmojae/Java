package _04_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

    public static String divide(int x, int y) {
        // 나누기 함수
        return x + "/" + y + "=" + (x/y);
    }

    public static int getLength(String str) {
        // 문자열의 길이 반환
        return str.length();
    }

    public static int getValueByIdx(int[] arr, int idx) {
        // 배열의 요소를 반환하는 함수
        return arr[idx];
    }

    public static void main(String[] args) {
        System.out.println(divide(6, 2));
        //System.out.println(divide(6, 0)); exception 발생
        //System.out.println("여기까지 도착하나");
        
        // ## case1. 0으로 나누기 [ArithmeticException]
        System.out.println("== ArithmeticException ==");
        try {
            System.out.println("나누기 연산 시작");
            System.out.println(divide(6, 0)); // exception 발생
        } catch(ArithmeticException e) {
            // e.getMessage() : 에러가 발생한 이유
            System.out.println("나누기 중 에러 발생 >> " + e.getMessage());
            // e.toString() : 에러가 발생한 이유, 예외의 종륲
            System.out.println("나누기 중 에러 발생 >> " + e.toString());
        } finally {
            System.out.println("나누기 연산 종료");
        }

        // ## case2. null에 접근하려고 할때 [NullPointException]
        //System.out.println("단어 길이: " + getLength(new String("hello")));
        //System.out.println("단어 길이: " + getLength(null)); //예외 발생
        System.out.println("== NullPointerException ==");
        try {
            System.out.println("단어 길이: " + getLength(new String("hello")));
            System.out.println("단어 길이: " + getLength(null)); //예외 발생
        } catch(NullPointerException e) {
            System.out.println("단어 길이 에러 발생 >> " + e.getMessage());
            System.out.println("단어 길이 에러 발생 >> " + e.toString());
        } finally {
            System.out.println("단어 길이 종료");
        }


        System.out.println("== ArrayIndexOutOfBoundsException ==");
        // case3. index 값으로 배열접근시 없는 범위로 접근 [ArrayIndexOutOfBoundsException]
        int[] numbers = {10,20,30,40,50};
        try {
            System.out.println(getValueByIdx(numbers, 1)); // 20
            System.out.println(getValueByIdx(numbers, 10)); // 예외 발생
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.getMessage());
            System.out.println("배열 인덱싱 중 에러 발생 >> " + e.toString());
        } finally {
            System.out.println("배열 인덱스 종료");
        }


        System.out.println("== InputMismatchException ==");
        // case4. 입력 형식 오류 [InputMismatchException]
        Scanner scan = new Scanner(System.in);
        System.out.println("정수를 입력하세요");
        try {
            int number = scan.nextInt();
            System.out.println("정수 확인: " + number);
        } catch(InputMismatchException e) {
            System.out.println("입력 형식 에러 발생 >> " + e.getMessage());
            System.out.println("입력 형식 에러 발생 >> " + e.toString());
        } finally {
            System.out.println("종료");
        }

    }

}
