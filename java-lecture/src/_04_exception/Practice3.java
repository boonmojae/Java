package _04_exception;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        try {
            System.out.print("배열의 크기를 입력해주세요.");
            int size = scan.nextInt();

            if (size <= 0) {
                throw new NegativeArraySizeException();
            }

            System.out.println(size + "개의 정수를 입력하세요.");

            List<Integer> array = new ArrayList<>();
            List<Integer> duplicates = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                System.out.print("정수 " + (i + 1) + ": ");
                int input = scan.nextInt();

                if (array.contains(input) && !duplicates.contains(input)) {
                    duplicates.add(input);
                }
                array.add(input);
            }

            if (duplicates.isEmpty()) {
                System.out.println("중복 요소가 없습니다.");
            } else {
                System.out.println("중복 요소: " + duplicates);
            }
        } catch (InputMismatchException e) {
            System.out.println("정수를 입력해주세요.");
        } catch (NegativeArraySizeException e) {
            System.out.println("양수를 입력해주세요.");
        }
    }
}
