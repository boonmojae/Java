package _02_control_statement;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Loop {
    public static void main(String[] args) {
        // 기본 for 문
        for(int i=0; i <= 10; i++) {
            System.out.println(i);
        }

        // 기본 while 문
        System.out.println("=== while ===");
        int i = 1;
        while(i <= 10) {
            System.out.println(i);
            i++;
        }

        System.out.println("=== do-while ===");
        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while(j<=10);

        System.out.println("=== string형태의 배열 ===");
        String[] array={"A", "B", "C"};

        // collection type 데이터에서 데이터가 존재하는 횟수만큼 반복 실행
        for(String a:array) {
            System.out.println("a= " + a);
        }

        // array list 자료 구조
        System.out.println("=== array list ===");
        List<String> list = new ArrayList<String>();
        list.add("A");
        list.add("B");
        list.add("C");
        for(String l: list) {
            System.out.println("l= " + l);
        }

        // for ~ each
        System.out.println("=== forEach ===");
        list.forEach(data -> System.out.println("data:" + data));
        System.out.println("=== forEach 두줄버전 ===");
        list.forEach(data -> {
            System.out.print("data!");
            System.out.println(data);
        });
    }
}
