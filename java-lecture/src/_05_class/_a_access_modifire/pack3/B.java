package _05_class._a_access_modifire.pack3;

public class B {
    public static void main(String[] args) {
        A a = new A(); // 생성자가 실행되면서 method1,2,3 모두 출력
        // 메서드들이 출력되는 이유는 생성자라는 '내부 통로'를 통해 호출되기 때문
        System.out.println(a.field1); // public
        System.out.println(a.field2); // default
        // System.out.println(a.field3); // private

        a.field1 = 11;
        a.field2 = 22;
        // a.field3 = 33;

        System.out.println(a.field1);
        System.out.println(a.field2);

        a.method1();
        a.method2();
        // a.method3();
    }
}
