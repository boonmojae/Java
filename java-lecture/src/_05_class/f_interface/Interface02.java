package _05_class.f_interface;

// abstract 클래스이면 
abstract  class myAbstractClass {
    // 여기서 abstract 반드시 붙여야됨
    public abstract void abstractMethod();
}

interface MyInterface{
    void interfaceMethod();
}

// 클래스에 extends, implement 둘 다 사용 가능
public class Interface02 extends myAbstractClass implements  MyInterface{

    @Override
    public void abstractMethod() {
        System.out.println("추상 클래스로부터 상속받은 메소드");
    }

    @Override
    public void interfaceMethod() {
        System.out.println("인터페이스로부터 상속받은 메소드");
    }

    public static void main(String[] args) {
        Interface02 inter = new Interface02();
        inter.abstractMethod();
        inter.interfaceMethod();
    }

}
