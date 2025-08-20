package practice.ss;

interface Music {
    void play();
    void stop();
}

class Mp3Player implements Music{

    private String title;

    public Mp3Player(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("MP3 플레이어에서 " + title + "음악을 재생합니다");
    }

    @Override
    public void stop() {
        System.out.println("MP3 플레이어에서 " + title + "음악을 정지합니다");
    }
}

class CdPlayer implements Music {
    
    private String title;

    public CdPlayer(String title) {
        this.title = title;
    }

    @Override
    public void play() {
        System.out.println("Cd 플레이어에서 " + title + "음악을 재생합니다");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + title + "음악을 정지합니다");
    }
}

public class Practice2 {
    public static void main(String[] args) {
        Mp3Player mp3 = new Mp3Player("포켓몬 bgm");
        CdPlayer cd = new CdPlayer("젤다 bgm");

        mp3.play();
        mp3.stop();
        cd.play();
        cd.stop();

    }
}


