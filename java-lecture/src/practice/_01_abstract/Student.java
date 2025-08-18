package practice._01_abstract;

public abstract class Student {
    private String name;
    private String school;
    private int age;
    private int student_ID;

    public Student(String name, String school, int age, int student_ID) {
        this.name = name;
        this.school = school;
        this.age = age;
        this.student_ID = student_ID;
    }

    public String getName() {
        return name;
    }

    public String getSchool() {
        return school;
    }

    public int getAge() {
        return age;
    }

    public int getStudent_ID() {
        return student_ID;
    }

    public abstract void todo();
}
