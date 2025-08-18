package _05_class.e_abstract;

public class ShapeEx {
    public static void main(String[] args) {
        // Shape test = new Shape("red");
        // shap 클래스는 abstract 이기 때문에 실제 인스턴스 생성 불가
        Circle cir = new Circle("pink");
        Square squ = new Square("blue", "마름모");

        System.out.println("=== 원 ===");
        cir.start();
        cir.draw();
        System.out.println("원의 색깔: " + cir.getColor());

        System.out.println("=== 사각형 ===");
        squ.start();
        squ.draw();
        squ.showType(); // square 클래스의 일반 메소드
        System.out.println("사각형의 종류: " + squ.getType() + "색깔은 " + squ.getColor());
    }
}
