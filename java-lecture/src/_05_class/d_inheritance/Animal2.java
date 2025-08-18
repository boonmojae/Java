package _05_class.d_inheritance;

public class Animal2 {

    private String breed;
    private String name;
    private int age;

    public Animal2(String breed, String name, int age) {
        this.breed = breed;
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void makeSound() {
        System.out.println("동물은 소리를 낸다");
    }

}
