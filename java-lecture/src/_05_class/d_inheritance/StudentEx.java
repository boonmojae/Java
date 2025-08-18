package _05_class.d_inheritance;

public class StudentEx {
    public static void main(String[] args) {

        // Case 1. public 필드인 경우
//        Student std1 = new Student("mojae", 88, "영등포");
//        // Student의 super()가 자동으로 출력
//
//        System.out.println(std1.name);
//        System.out.println(std1.age);
//        System.out.println(std1.campus);
//
//        // Person 부모 클래스로부터 상속받은 메소드
//        std1.say();
//        std1.eat("푸딩");
//        std1.setCampus("영");

        // Case 1. private 필드인 경우
        // Student std2 = new Student("mojae", 88, "dud");
        Student std2 = new Student("mojae", 88);
        System.out.println("std2의 이름: " + std2.getName());
        System.out.println("std2의 나이: " + std2.getAge());
        System.out.println("std2의 캠퍼스: " + std2.getCampus());

        // Person 으로부터의 메소든
        std2.say();
        std2.eat("푸딩");
        
        // Student 만의 메소드
        std2.setCampus("영등포");
        System.out.println("std2의 캠퍼스: " + std2.getCampus());
        
        
    }
}
