package practice._01_abstract;

public class Baek extends Student{
    public Baek(String name, String school, int age, int student_ID) {
        super(name, school, age, student_ID);
    }

    @Override
    public void todo() {
        System.out.println("점심은 백종원 피자");
    }

}
