package _07_collection._list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {
    public static void main(String[] args) {
        List<Book> list = new ArrayList<>();
        
        list.add(new Book("나루토1", "마사시1"));
        list.add(new Book("나루토2", "마사시2"));
        list.add(new Book("나루토3", "마사시3"));
        list.add(new Book("나루토4", "마사시4"));
        list.add(new Book("나루토5", "마사시5"));
        System.out.println(list);

        System.out.println("총 " + list.size() + "권");

        // index 3번 요소 접근
        Book index3Book = list.get(3);
        System.out.println(index3Book);
        list.remove(3);
        list.remove(3); // 4번인덱스가 땡겨져서 3번이 됨

        System.out.println("=== 삭제 후 출력 ===");
        for (Book b: list) {
            System.out.println(b);
        }

        System.out.println("비어있나요? " + list.isEmpty());
        list.clear();
        System.out.println("비어있나요? " + list.isEmpty());
    }
}

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{ title = " + title + ", author = " + this.author + "}";
    }
}

