package _05_class._a_access_modifire.pack5;

public class Person {
    private String name;
    private int age;

    // 생성자
    public Person(String name) {
        this.name = name;
    }

    // getter 와 setter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        // 필드에 직접 접근하면 아래처럼 예외처리는 불가능함
        if (age < 0) {
            this.age = 0;
        } else {
            this.age = age;
        }
    }
}
