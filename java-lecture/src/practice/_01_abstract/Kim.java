package practice._01_abstract;

public class Kim extends  Student{
    public Kim(String name, String school, int age, int student_ID) {
        super(name, school, age, student_ID);
    }

    @Override
    public void todo() {
        System.out.println("점심은 김가네 김밥");
    }

}
