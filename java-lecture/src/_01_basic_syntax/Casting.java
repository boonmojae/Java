package _01_basic_syntax;

// 형변환

public class Casting {
    public static void main(String[] args) {
        // 1. 묵시적 형변환
        // - 더 작은 타입에서 더 큰 타입으로 자동 형변환
        // - 반대의 경우는 자동으로 형변환되지 않음 >> 명시적으로 변환 필수
        int smallerNumber = 10;
        double bigNumber = smallerNumber; // int -> double 자동 형변환
        System.out.println("bigNumber: " + bigNumber);

        // 2. 명시적 형변환
        double anotherBigNumber = 20.7;
        int anotherSmallerNumber = (int)anotherBigNumber; //int를 명시하지 않으면 에러가 남
        System.out.println("anotherBigNumber: " + anotherBigNumber);
        System.out.println("anotherSmallerNumber: " + anotherSmallerNumber);

        int largeNumber = 1000;
        byte smallerByte = (byte) largeNumber;
        System.out.println("largeNumber: " + largeNumber);
        System.out.println("smallerByte: " + smallerByte); // -24 데이터 유실됨
        // 데이터 손실이 일어날 수 있으니 주의해야됨
    }
}
