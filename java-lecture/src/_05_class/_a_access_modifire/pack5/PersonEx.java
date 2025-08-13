package _05_class._a_access_modifire.pack5;

public class PersonEx {
    public static void main(String[] args) {
        Person p1 = new Person("mojja");
        Person p2 = new Person("lella");

        System.out.println(p1.getName() + "의 나이는 " + p1.getAge());
        p1.setAge(88);
        System.out.println(p1.getName() + "의 나이는 " + p1.getAge());

        p2.setAge(-100);
        System.out.println(p2.getName() + "의 나이는 " + p2.getAge());
    }
}

