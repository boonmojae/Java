package _06_generic;

class Person {}
class Student extends Person {}
class Teacher extends Person {}
class WebStudent extends Student {}
class MobileStudent extends Student {}

/**
 * Person
 * - Student
 *      - WebStudent
 *      - MobileStudent
 * - Teacher
 */

class Applicant<T> {
    public T kind;
    public Applicant(T kind) { // 지원자의 종류
        this.kind = kind;
    }
}

class Course {
    public static void registerCourseA(Applicant<?> applicant){
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course A를 등록했습니다.");
    }
    public static void registerCourseB(Applicant<? extends Student> applicant){
        // applicant : Student 를 상속받는 타입(클래스)만 올 수 있음 (Student 포함)
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course B를 등록했습니다.");
    }
    public static void registerCourseC(Applicant<? super Teacher> applicant){
        // applicant : Teacher 클래스의 부모가 되는 타입(클래스)만 올 수 있음 (Teacher 포함)
        System.out.println(applicant.kind.getClass().getSimpleName() + "이(가) Course C를 등록했습니다.");
    }
}

// getClass(), getSimpleName() 메소드
// Object 클래스에서 제공하는 기본 메소드
// getClass(): 객체의 클래스 정보 반환 (java.lang.String)
// getSimpleName(): 패키지 정보를 제외한 클래스 이름만 반환 (String)

public class GenericEx3 {
    public static void main(String[] args) {
        Course.registerCourseA(new Applicant<String>("applicant"));
        
        // Course B >> ? extends Student: Student 의 자식들
        // Course.registerCourseB(new Applicant<Person>(new Person())); error
        // Course.registerCourseB(new Applicant<Person>(new Teacher())); error
        Course.registerCourseB(new Applicant<Student>(new Student()));
        Course.registerCourseB(new Applicant<Student>(new MobileStudent()));
        Course.registerCourseB(new Applicant<Student>(new WebStudent()));

        // Course C >> ? super Teacher: Teacher 의 부모
        Course.registerCourseC(new Applicant<Person>(new Person()));
        Course.registerCourseC(new Applicant<Teacher>(new Teacher()));
        // Course.registerCourseC(new Applicant<Teacher>(new Student())); error

    }
}
