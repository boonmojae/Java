package _05_class.f_interface;

public interface RemoteControl {

    // 인터페이스는 추상메소드가 한 개 이상 무조건 있어야 함!
    public void turnOn(); // abstract 키워드는 생략해도 추상메소드로 만들어짐

    public void turnOff();

    public void setVolume(int volume);

    // 인터페이스로 선언되는 필드는 모두 public static final 특성임(생략가능)
    // 인터페이스의 필드는 상수! => 대문자로 변수명 작성
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;
}
