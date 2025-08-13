package _05_class;

public class Puppy {
    
    // 생성자는 생략 가능

    public void printInfo(String name) {
        System.out.println("puppy's name is " + name);
    }

    public void printInfo(String name, int age) {
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
