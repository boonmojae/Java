package _07_collection._list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CompareList {
    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();

        long startTime;
        long endTime;

        // ArrayList
        startTime = System.nanoTime();
        for(int i =0; i< 10000; i++) {
            list1.add(0, String.valueOf(i)); // i를 String으로 변환
        }
        endTime = System.nanoTime();
        System.out.println("ArrayList 소요 시간: " + (endTime - startTime));

        // LinkedList
        startTime = System.nanoTime();
        for(int i =0; i< 10000; i++) {
            list2.add(0, String.valueOf(i)); // i를 String으로 변환
        }
        endTime = System.nanoTime();
        System.out.println("LinkedList 소요 시간: " + (endTime - startTime));

        /**
         * ArrayList 소요 시간: 6172199
         * LinkedList 소요 시간: 1836100
         */
    }
}
