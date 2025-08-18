package _05_class.d_inheritance;

public class Cat2 extends Animal2{

    public Cat2(String name, int age) {
        super("고양이", name, age);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("야옹");
    }

    public void scratch() {
        System.out.println(getName() + "가 스크래치를 합니다.");
    }
}
