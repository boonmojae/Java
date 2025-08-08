package _01_basic_syntax;

public class Operator {
    public static void main(String[] args) {
        int x, y;
        float a, b;
        x = 11;
        y = 3;
        a = 11.0f;
        b = 3.0f;
        System.out.println("=== 정수형 연산 x, y ===");
        System.out.println("x + y= " + (x+y));
        System.out.println("x - y= " + (x-y));
        System.out.println("x * y= " + (x*y));
        System.out.println("x / y= " + (x/y)); // 몫
        System.out.println("x % y= " + (x%y)); // 나머지
        System.out.println("x^3" + Math.pow(x, 3)); // double

        System.out.println("=== 실수형 연산 ===");
        System.out.println("a+b="+(a+b));
        System.out.println("a-b="+(a-b));
        System.out.println("a*b="+(a*b));
        System.out.println("a/b="+(a/b));
        System.out.println("a%b="+(a%b));
        System.out.println("a^3="+Math.pow(a,3)); //실수형으로 출력됨

        System.out.println("=== 증감연산자 ===");
        x = 10;
        // 증감연산자
        System.out.println("x++ " + x++ + ' ' + x); // 후위 증가 10 11
        System.out.println("++x " + ++x + ' ' + x); // 전위 증가 12 12
        System.out.println("x-- " + x-- + ' ' + x); // 후위 감소 12 11
        System.out.println("--x " + --x + ' ' + x); // 전위 감소 10 10

        System.out.println("=== 산술 대입 연산자 ===");
        System.out.println(x);
        System.out.println("x += 5 " + (x += 5));
        System.out.println("x -= 5 " + (x -= 5));
        System.out.println("x *= 5 " + (x *= 5));
        System.out.println("x /= 5 " + (x /= 5));
        System.out.println("x %= 5 " + (x %= 5));
        System.out.println(x);

        System.out.println("=== 비교 연산자 ===");
        System.out.println("a, b " + a + " " + b);
        System.out.println("a > b :: " + (a > b));
        System.out.println("a >= b :: " + (a >= b));
        System.out.println("a < b :: " + (a < b));
        System.out.println("a <= b :: " + (a <= b));
        System.out.println("a == b :: " + (a == b));
        System.out.println("a != b :: " + (a == b));

        System.out.println("=== 논리 연산자 ===");
        boolean j = true;
        boolean k = false;
        boolean l = true;
        System.out.println("j&&k " + (j&&k)); // flase
        System.out.println("j||k " + (j||k)); // true
        System.out.println("j&&l " + (j&&l)); // true
        System.out.println("!j " + (!j)); // false

        System.out.println("=== 삼항연산자 ===");
        System.out.println("x="+ x + " y=" + y);
        System.out.println(x>y? "x는 y보다 큽니다.": "x는 y보다 크지 않습니다.");
    }
}
