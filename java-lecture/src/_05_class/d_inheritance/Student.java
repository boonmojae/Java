package _05_class.d_inheritance;

public class Student extends Person{
    // Case 1. 부모의 필드가 public 인 경우
//    public String campus;
//
//    public Student(String name, int age, String campus) {
//        // super(); Person의 생성자에서 매개변수를 전달하지 않을 떄는 생략 가능
//        this.campus = campus;
//        this.name = name; // 부모의 필드이지만 public으로 접근 가능
//        this.age = age;
//        System.out.println("자식 클래스 생성자 Student(name, age, campus) 가 실행");
//    }
//
//    public void setCampus(String campus) {
//        this.campus = campus;
//        System.out.println(campus + "캠퍼스에서 공부중");
//    }

    // Case 2. 부모의 필드가 private 인 경우
    private String campus;
    
    // Person의 생성자에 name, age값을 필수로 보내야됨
    public Student(String name, int age) {
        super(name, age); // Person에 전달 super = new Person과 동일, 생략 불가능 => 매개변수를 전달하고 있기 때문
        // this.campus = campus; campus 생성자가 없어서 StudentEx에서 null이 뜸
    }

    public String getCampus() {
        return this.campus;
    }

    public void setCampus(String campus) {
        this.campus = campus;
    }
}
