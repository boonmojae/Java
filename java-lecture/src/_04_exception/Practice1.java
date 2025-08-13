package _04_exception;

import java.util.ArrayList;
import java.util.List;

public class Practice1 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3, 4};
            for (int num : numbers) {
                System.out.println(num);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("인덱스 범위를 벗어났습니다");
        }
    }
}
