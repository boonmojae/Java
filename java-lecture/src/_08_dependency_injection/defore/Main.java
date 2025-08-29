package _08_dependency_injection.defore;

// #3
// BoardService에서 FileBoard -> DbBoardPersistance로 바뀌어도 Main은 수정하지 않음
public class Main {
    public static void main(String[] args) {
        // 인스턴스 생성
        BoardService service = new BoardService();
        service.save();
        service.delete();
    }
}
