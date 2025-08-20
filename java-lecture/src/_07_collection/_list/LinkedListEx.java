package _07_collection._list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        System.out.println("초기 linked list: " + list); // [apple, banana, cherry]

        // addFirst(), addLast() : LinkedList 에 특화된 메소드
        // LinkedList로 선언해야됨 List에서는 안됨
        list.addFirst("grape");
        list.addLast("orange");
        System.out.println("요소 추가 후: " + list); // [grape, apple, banana, cherry, orange]

        list.add(2,"kiwi");
        System.out.println("중간 요소 추가 후: " + list); // [grape, apple, kiwi, banana, cherry, orange]

        list.remove("banana");
        System.out.println("banana 삭제 후: " + list);

        // 특정 요소를 반환 후 삭제됨
        String first = list.removeFirst();
        String last = list.removeLast();
        System.out.println("삭제된 요소: " + first);
        System.out.println("삭제된 요소: " + last);
        System.out.println("삭제 후 list: " + list);

        System.out.println("=== 요소 검색 ===");
        boolean containsCherry = list.contains("cherry");
        System.out.println("cherry 포함 여부: " + containsCherry);
        int indexOfCherry = list.indexOf("cherry");
        System.out.println("cherry index 인덱스: " + indexOfCherry);

        System.out.println("=== Linked List 순회 ===");
        for (String f : list) {
            System.out.println("fruit: " + f);
        }
        System.out.println("Linked list 의 크키: " + list.size());
        list.clear();
        System.out.println("Linked list 의 크키(clear 후): " + list.size());
    }
}
