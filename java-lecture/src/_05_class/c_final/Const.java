package _05_class.c_final;

public class Const {

    // final String name = "mojae"; 필드 선언 시 초기화
    final String name; // only final 인스턴스에 속해있는 변수 // = "mojae"

    static int MIN_VALUE = 0; // only static, final이 없어서 값을 변경할 수 있지만 인스턴스에 속해있지 않고 인스턴스 공유 변수이다. 수정 불가

    // 정수형 상수 선언
    public static final int MAX_VALUE = 100;

    // 문자열 상수 선언
    public static final String GREETING = "hello, world";

    // 생성자에서 초기화
    public Const(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        System.out.println(Const.MIN_VALUE); // static
        System.out.println(Const.MAX_VALUE); // static final

        Const.MIN_VALUE = 88;
        System.out.println("변경 후 MIN_VALUE: " + Const.MIN_VALUE);

        // final은 재할당 불가능
        // Const.MAX_VALUE = 99;

        Const c1 = new Const("mojae"); //name에는 static이 없어서 객체 생성후 접근
        System.out.println(c1.name); // final
        // c1.name = "mojja";

    }
}
