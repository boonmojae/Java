package _05_class.f_interface;

public class Execute {
    public static void main(String[] args) {
        
        RemoteControl rc; // Referencce 타입, null 초기화할 수 있음
        rc = null;
        System.out.println(rc); // null

        System.out.println("=== Television 객체 생성 ===");

        rc = new Television(); // RemoteControl rc = new Television();
        rc.turnOn();
        rc.setVolume(5);
        rc.turnOff();

        System.out.println("=== audio 객체 생성 ===");
        // 새롭게 만드는게 아닌 기존의 rc를 덮어씌움
        rc = new Audio(); // RemoteControl rc = new Audio();
        rc.turnOn();
        rc.setVolume(100);
        rc.turnOff();
    }
}
