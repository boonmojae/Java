package _03_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Java Collections
 * - List
 * - ArrayList
 * - LinkedList
 * - Vector
 * - Set
 * - HashSet
 * - TreeSet
 * - Map
 * - HasgMap
 * - HashTable
 */
public class ArrayListEx {
    public static void main(String[] args) {
        // List<타입> list = new ArrayList<>(); // 반드시 reference타입으로 써야됨
        List<Integer> numbers = new ArrayList<>();
        System.out.println(numbers);

        System.out.println("=== 1. isEmpty() ===");
        // 1. isEmpty()
        System.out.println("isEmpty? " + numbers.isEmpty()); // true


        System.out.println("=== 2. 요소 추가 add ===");
        // 2. 요소 추가 add
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);
        System.out.println(numbers);
        System.out.println("isEmpty? " + numbers.isEmpty()); // false
        System.out.println("contains " + numbers.contains(10)); // true
        System.out.println("contains " + numbers.contains(11)); // false

        System.out.println("=== 3. 요소 ===");
        // 3. 요소
        // System.out.println(numbers[0]); // error, 이렇게 접근 X
        System.out.println("0번째 인덱스: " + numbers.get(0));
        System.out.println("0번째 인덱스: " + numbers.get(1));


        System.out.println("=== 4. 요소 수정 ===");
        // 4. 요소 수정
        // numbers.set(인덱스번호, 바꿀값);
        numbers.set(1, 77);
        System.out.println(numbers);


        System.out.println("=== 5. 요소 삽입 add ===");
        // 5. 요소 삽입 add
        // numbers.add(인덱스번호, 요소)
        numbers.add(1, 7);
        System.out.println(numbers);

        System.out.println("=== 6. ArrayList 끼리 연결: addAll ===");
        // 6. ArrayList 끼리 연결: addAll
        System.out.println(Arrays.asList(99, 35, 55)); // 배열 > list


        System.out.println("=== List<Integer> ===");
        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(100, 99, 88));
        System.out.println("numbers2: " + numbers2); // [100, 99, 88]
        numbers.addAll(numbers2); // numbers arrayList 가 변경
        System.out.println("연결됐는지 확인: " + numbers); // [10, 7, 77, 30, 40, 50, 100, 99, 88]

        System.out.println("=== 7. 요소의 위치를 찾기 ===");
        // 7. 요소의 위치를 찾기 indexOf(요소)
        System.out.println(numbers.indexOf(50));
        System.out.println(numbers.indexOf(1)); // -1(요소가 없을 때)


        System.out.println("=== 8. 요소 삭제 remove ===");
        // 8. 요소 삭제 remove(인덱스)
        numbers.remove(2);
        // 삭제 후 뒤에 있는 요소가 한 칸씩 앞으로 옴
        System.out.println(numbers);


        System.out.println("=== 9. 리스트 크기 확인 ===");
        // 9. 리스트 크기 확인
        // System.out.println(numbers.length);
        System.out.println("리스트의 크기: " + numbers.size());

        System.out.println("=== 10. 모든 요소 출력 ===");
        // 10. 모든 요소 출력
        for (int n : numbers) {
            System.out.println(n + " ");
        }


        System.out.println("=== 11. 모든 요소 삭제 ===");
        // 11. 모든 요소 삭제
        numbers.clear();
        System.out.println(numbers);


        System.out.println("=== List<Student> students ===");
        //----------------------------------------------------
        // Student 타입의 ArrayList 생성
        List<Student> students = new ArrayList<>();
        students.add(new Student("mojae", 88));
        students.add(new Student("jjackson", 22));
        students.add(new Student("mojjalella", 8));

        System.out.println("학생수: " + students.size());
        Student std1 = students.get(0); // type은 generic으로 했기 때문에 Student타입을 작성해야됨 / student[0]X
        System.out.println("학생 이름: " + std1.getName() + " 학생 나이: " + std1.getAge());

        System.out.println("= 학생 명단 =");
        for (Student std: students) {
            System.out.println(std.getName() + "(" + std.getAge() + ")");
        }

        students.remove(1);
        System.out.println("삭제 후 >> " + students);
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name=" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
