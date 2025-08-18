package _05_class.d_inheritance;

public class Animal2Ex {
    public static void main(String[] args) {
        Dog2 dog = new Dog2("멍", 5);
        Cat2 cat = new Cat2("냥", 8);

        dog.makeSound();
        cat.makeSound();
    }
}
