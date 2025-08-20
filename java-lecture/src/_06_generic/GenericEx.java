package _06_generic;

import java.util.ArrayList;

class CustomList {

    // 필드: list
    ArrayList<String> list = new ArrayList<>();

    // 메소드: 요소 추가, 요소 삭제, 요소 접근
    public void addElement(String element) {
        list.add(element);
    }

    public void removeElement(String element) {
        list.remove(element);
    }

    public String get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomList: " + list;
    }
}

class CustomListGeneric<T> {
    ArrayList<T> list = new ArrayList<>();

    public void addElement(T element) {
        list.add(element);
    }

    public void removeElement(T element) {
        list.remove(element);
    }

    public T get(int i) {
        return list.get(i);
    }

    @Override
    public String toString() {
        return "CustomListGeneric: " + list;
    }
}

public class GenericEx {
    public static void main(String[] args) {
        CustomList li = new CustomList();
        li.addElement("first");
        li.addElement("second");
        li.addElement("third");
        System.out.println(li.toString());

        li.removeElement("second");
        System.out.println(li.toString());

        System.out.println(li.get(0));

        System.out.println("=== Generic ===");
        // 클래스이름<사용할타입> 변수명 = new 생성자이름<>()
        CustomListGeneric<Integer> gen = new CustomListGeneric<>();
        gen.addElement(8);
        gen.addElement(88);
        gen.addElement(888);
        System.out.println(gen);

        gen.removeElement(88);
        System.out.println(gen);
        System.out.println(gen.get(1));

        CustomListGeneric<Character> ch = new CustomListGeneric<>();
        ch.addElement('M');
        ch.addElement('O');
        ch.addElement('재');
        ch.addElement('@');
        System.out.println(ch);
    }
}
