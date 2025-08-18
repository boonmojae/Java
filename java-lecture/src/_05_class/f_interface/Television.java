package _05_class.f_interface;

public class Television implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다");
    }

    @Override
    public void setVolume(int v) {
        // 매개변수와 필드명이 다르면 this.을 붙이지 않아도 된다
        if (v > RemoteControl.MAX_VOLUME) {
            volume = RemoteControl.MAX_VOLUME;
        } else if (v < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            volume = v;
        }
        System.out.println("현재 TV의 volume: " + volume);
    }
}
