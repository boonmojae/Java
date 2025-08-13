package _05_class._b_static;

public class CalculatorEx {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        // new Calcurator 를 통해 인스턴스를 만들지 않아도 static 멤버에 접근 가능
        double circleArea = num1 * num1 * Calculator.pi;
        System.out.println("원의 넓이: " + circleArea);

        int plusResult = Calculator.plus(num1, num2);
        System.out.println("덧셈 결과: " + plusResult);

        int minusResult = Calculator.minus(num1, num2);
        System.out.println("뺄셈 결과: " + minusResult);

        System.out.println(a);
        // static은 재할당이 가능하다
        a = 88;
        System.out.println(a);

    }

    static int a = 10;
}
