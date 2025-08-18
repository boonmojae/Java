package _05_class.d_inheritance;

public class DogEx {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sayHello(); // 부모 클래스의 메소드
        dog.fetch(); // 자식 클래스의 메소드
        dog.makeSound("멍멍"); // 메소드 오버라이딩

        Animal cat = new Animal();
        cat.sayHello();
        cat.makeSound("냐옹");
    }
}
