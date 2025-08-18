package _05_class.f_interface;

public class Audio implements RemoteControl{

    private int volume;

    @Override
    public void turnOn() {
        System.out.println("리모컨으로 Audio를 켭니다");
    }

    @Override
    public void turnOff() {
        System.out.println("리모컨으로 Audio를 끕니다");
    }

    @Override
    public void setVolume(int volume) {
        if (volume > RemoteControl.MAX_VOLUME) {
            this.volume = RemoteControl.MAX_VOLUME;
        } else if (volume < RemoteControl.MIN_VOLUME) {
            this.volume = RemoteControl.MIN_VOLUME;
        } else {
            this.volume = volume;
        }

        System.out.println("Audio의 현재 볼륨: " + this.volume);
    }
}
