import java.util.Arrays;
public class Main {

    /**
     * public: 접근 제어자 (private, public, default, protected)
     * static: JVM이 main 함수를 곧바로 실행하도록 도와줌
     * void: main함수의 return 타입
     */

    public static void main(String[] args) {

        System.out.println("Hello World!");

        // args 인자 확인
        System.out.println("arg's length: " + args.length);
        System.out.println(Arrays.toString(args));

        // java src/Main.java 11 22(인자 전달은 선택사항)
    }
}