package _06_generic;

// Number 클래스 (숫자형식의 부모 클래스)
// 정수형, 실수형 모두 포함
// -Byte, Short, Integer, Long, Float, Double

import _05_class._a_access_modifire.pack2.C;

// generic 클래스 제한
// T 타입은 Number 를 상속받은 클래스만 허용
class Box<T extends Number>{

    private T item;

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}

interface Moveable {
    void move();
}

class Container<T extends Moveable> {

    private T item;

    public Container(T item) {
        this.item = item;
    }

    public void makeItMove() {
        item.move(); // Moveable 인터페이스의 추상메소드
    }
}

class Car implements Moveable {

    @Override
    public void move() {
        System.out.println("자동차 출발~! 빵빵");
    }
}

public class GenericEx2 {
    public static void main(String[] args) {
        // Box <T extends Number> 를 상속받고 있어서 Number만 가능
        Box<Integer> box1 = new Box<>(); 
        box1.setItem(10);
        System.out.println("box1's item: " + box1.getItem());

        Box<Double> box2 = new Box<>();
        box2.setItem(8.8);
        System.out.println("box2's item: " + box2.getItem());

        Box<Short> box3 = new Box<>();
        // 정수형 리터럴은 기본적으로 int 형으로 간주되기 때문에 => Integer
        // short, byte 타입으로 설정할 때는 명시적으로 형변환 후 사용해야됨
        box3.setItem((short) 40);
        System.out.println("box3's item: " + box3.getItem());

        //-------------- extends Movable ----------------
        Car c = new Car();
        Container<Car> car = new Container<>(c);
        car.makeItMove();

    }
}
