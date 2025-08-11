package _03_array;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("문자를 입력하세요");
            String input = scan.nextLine();
            if (input.equals("exit")) {
                break;
            }
            list.add(input);
        }

        for (String word : list) {
            System.out.println(word);
        }

        scan.close();
    }
}


