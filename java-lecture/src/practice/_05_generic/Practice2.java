package practice._05_generic;

class Calculator<T extends Number> {

    private T num1;
    private T num2;

    public Calculator(T num1, T num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public double add() {
        return num1.doubleValue() + num2.doubleValue();
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Calculator<Integer> intCalculator  = new Calculator<>(10, 5);
        Calculator<Double> doubleCalculator = new Calculator<>(5.0, 0.64);
        System.out.println("Integer Sum: " + intCalculator.add());
        System.out.println("Double sum: " + doubleCalculator.add());
    }
}
