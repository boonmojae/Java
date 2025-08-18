package _05_class.d_inheritance;

public class Dog extends Animal{
    // Animal 클래스의 멤버
    // name 필드
    // makeSound(String t) sayHello() 메소드

    @Override // 부모 메소드의 내용을 새로운 내용으로 재정의하겠다
    // @Override? 컴파일러가 정확히 오버라이딩 되었는지 체크함 (생략 가능)
    // 함수의 이름, 함수의 리턴타입, 매개변수의 개수와 매개변수의 타입이 모두 일치해야 함
    void makeSound(String t) {
        System.out.println("이름: " + super.name); // 필드도 접근 가능
        super.makeSound(t); // 부모의 메소드를 호출해줄 수 있음
        // super 를 사용하면 내용을 그대로 가져올 수 있음
    }
    
    void fetch() {
        System.out.println("공 가져와");
    }

}
