package _05_class.c_final;

public class FinalMethodEx {
    public static void main(String[] args) {

    }
}

class ClassWithFinalMethod {
    final void showMessage() {
        System.out.println("이 메소드는 final 로 선언");
    }
}

// 상속
class subClass extends ClassWithFinalMethod {
    // 메소드 재정의 불가
    // final 메소드는 오버라이딩 불가
    //    void showMessage() {
    //
    //    }
}

final class FinalClass{} // 클래스에도 final 붙을 수 있음
// final이 붙은 클래스는 부모 클래스가 될 수 없다

//class SubClass extends  FinalClass{} // error, final 붙어있는 클래스는 상속 불가능