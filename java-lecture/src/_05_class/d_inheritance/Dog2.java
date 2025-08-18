package _05_class.d_inheritance;

public class Dog2 extends Animal2{

    public Dog2(String name, int age) {
        super("강아지", name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("멍멍");
    }
    
    public void walk() {
        System.out.println(getName() + "산책을 합니다");
    }
}
