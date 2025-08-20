package practice._06_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("이름과 나이를 입력하세요. '종료'를 입력하면 종료됩니다.");

        Map<String, Integer> map = new HashMap<>();

        while(true) {
            System.out.print("이름 입력: ");
            String k = scan.next();

            if (k.equals("종료")) {
                break;
            }

            System.out.print("나이 입력: ");
            int v = scan.nextInt();

            map.put(k, v);
        }

        System.out.println("== 입력 받은 이름과 나이 목록 ==");

        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : entrySet) {
            System.out.printf("이름: %s, 나이: %d", entry.getKey(), entry.getValue()).println();
        }

    }
}
