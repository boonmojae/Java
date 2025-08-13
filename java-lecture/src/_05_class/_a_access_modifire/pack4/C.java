package _05_class._a_access_modifire.pack4;

import _05_class._a_access_modifire.pack3.A;

public class C {
    public static void main(String[] args) {
        A a = new A();
        a.field1 = 111; // public 다른 패키지에서 접근 가능
        System.out.println("a field1= " + a.field1);

        // default, private 은 다른 패키지에서 접근 불가
        // a.field2 = 222; 
        // a.field3 = 333;

        a.method1();
    }
}

/**
 * A 클래스에 있는 생성자가 출력
 * method1
 * method2
 * method3
 * 
 * C 클래스에 있는 코드
 * a field1= 111
 * method1
 */