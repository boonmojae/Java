package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practice3_1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("배열의 크기를 입력해주세요.");
            int size = scan.nextInt(); // 예외발생 InputMismatchException

            if (size <= 0) {
                throw new IllegalArgumentException("양수를 입력해주세요."); // 0또는 음수의 값 예외
            }

            int[] array = new int[size];

            for (int i = 0; i < size; i++) {
                System.out.print("정수 입력: ");
                array[i] = scan.nextInt();
            }

            ArrayList<Integer> duplicates = findDuplicates(array);

            if (duplicates.isEmpty()) {
                System.out.println("중복된 요소가 없습니다.");
            } else {
                System.out.println("중복된 요소: " +duplicates);
            }

        } catch (InputMismatchException e) {
            System.out.println("배열의 크기로는 정수를 입력해주세요.");
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("배열의 크기는 1이상의 자연수이어야 합니다.");
        }
    }

    public static ArrayList<Integer> findDuplicates(int[] array) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        // 중복될 요소가 몇 개일지 확실하지 않음 -> 정적할당 불가
        // 배열의 크기를 조절이 할 수 있는 ArrayList를 사용 -> 동적할당이 가능

        // [1,2,3,4,5]
        // 1 vs 2,3,4,5
        // 2 vs 3,4,5
        // 3 vd 4,5 => 요소가 같은지 비교 하고, 같을 때 duplicates 에 add

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i]==array[j] && !duplicates.contains(array[i])) {
                    // array 배열에 중복된 요소가 있고
                    // duplicates에 해당 요소가 없는 경우
                    duplicates.add(array[i]); // i,j 상관 없음
                }
            }
        }
        return duplicates;
    }
}
