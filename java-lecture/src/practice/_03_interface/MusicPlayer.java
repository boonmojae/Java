package practice._03_interface;

public class MusicPlayer {
    public static void main(String[] args) {
        System.out.println("====== MP3 Player ======");
        Mp3Player mp3 = new Mp3Player("아이유 블루밍");
        mp3.play();
        mp3.stop();
        System.out.println();

        System.out.println("====== CD Player ======");
        CdPlayer cd = new CdPlayer("아이유 꽃갈피");
        cd.play();
        cd.stop();
    }
}
