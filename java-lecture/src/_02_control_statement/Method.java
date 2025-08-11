package _02_control_statement;

// method 정의 방법

import java.util.Arrays;

/**
 * [접근제한자] [static 선택 여부] [return type 필수] [함수명](타입 인자1, 인자2..) {
 * // 함수의 내용
 * // return
 * }
 */
public class Method {
    public static void main(String[] args) {
        hello();
        System.out.println(sum(3, 4));
        System.out.println(connect("헬로", "모재"));

        int number = 10; // primitive type
        int[] numbers = {10, 20, 30}; // reference type

        // call by value, call by address
        // 1. call by value
        // - primitive 타입을 함수의 인자로 전달
        // - 값을 함수로 전달하기 떄문에 원래 값은 변경되지 않는다.
        System.out.println("함수에 들어가기 전 value: " + number); // 10
        System.out.println("함수의 리턴값: " + multi10(number)); // 100
        System.out.println("함수를 마치고 난 후: " + number); // 10 주소를 전달하는게 아닌 값만 전달해서 사용되는것

        // 2. call by address
        // - reference 타입을 함수의 인자로 전달
        // - 변수가 저장되어 있는 "주소"를 전달,
        // - 함수 내부에서 전달된 변수를 변경하는 부분이 있다면 원래의 값도 같이 변경(같은 주소를 참조하고 있기 때문)
        // - 배열의 값이 아닌 주소를 전달하는것이기 때문에 값이 바뀐다면 원래의 값도 같이 바뀜

        System.out.println(numbers); //[I@58372a00 numbers에 저장된 주소값
        // Array.toString을 하지 않으면 주소값이 나옴 [I@58372a00
        System.out.println("함수에 들어가기 전 value: " +  Arrays.toString(numbers)); // [10, 20, 30]
        System.out.println("함수의 리턴값: " + Arrays.toString(multi10_2(numbers))); // [100, 200, 300]
        System.out.println("함수를 마치고 난 후: " + Arrays.toString(numbers)); // [100, 200, 300]
    }

    // 반환값이 없는 메소드: void
    public static void hello() {
        System.out.println("void");
    }

    // return 값이 있는 메소드
    public static int sum(int x, int y) {
        System.out.println("sum 호출");
        return x + y;
    }

    public static String connect(String a, String b) {
        System.out.println("connect 호출");
        return a + b;
    }

    // primitive type
    public static int multi10(int x) {
        x = x * 10;
        return x;
    }

    // reference type
    // 매개변수를 배열로 받음
    public static int[] multi10_2(int[] numbers) {
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = numbers[i]*10;
        }
        return numbers;
    }
}
