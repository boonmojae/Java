package practice._03_interface;

public class CdPlayer implements Music{

    private String album;

    public CdPlayer(String album) {
        this.album = album;
    }

    @Override
    public void play() {
        System.out.println("CD 플레이어에서 " + album + "음악을 재생합니다");
    }

    @Override
    public void stop() {
        System.out.println("CD 플레이어에서 " + album + "음악을 정지합니다");
    }
}
