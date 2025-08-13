package _05_class._a_access_modifire.pack2;

// 다른 패키지에 있는 클래스에 접근할 때 import 필수
import _05_class._a_access_modifire.pack1.B;

public class C {
    public static void main(String[] args) {
        // A instanceA = new A();
        // A클래스의 접근제한자는 default
        // >> 외부 패키지인 C 에서는 접근 불가
        
        B b = new B();
        // 다른 패키지에 있지만 public 으로 선언되어 있기 때문에 접근 가능
    }
}
