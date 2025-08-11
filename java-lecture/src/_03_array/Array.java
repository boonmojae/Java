package _03_array;

import java.util.Arrays;
import java.util.Collections;

// 표준 배열
public class Array {
    public static void main(String[] args) {

        int[] arra; // 관례적으로 이 방법을 더 많이 사용
        int arr2[];

        String[] temp = null;
        System.out.println(temp);

        System.out.println("=== int[] intArray ===");
        int[] intArray = {10, 20, 30, 40, 50};
        System.out.println("intArray[0]: " + intArray[0]); // 10
        System.out.println("intArray: " + intArray); // [I@58372a00
        intArray[1] = 22;
        System.out.println("intArray: " + Arrays.toString(intArray)); // [10, 20, 30, 40, 50]
        System.out.println(intArray[1]);

        System.out.println("=== char[] charArrays ===");
        char[] charArrays = {'a', 'A', '8', 66};
        System.out.println(charArrays[2]); // 8
        System.out.println(charArrays[3]); // B, ascii 코드와 대피되어 66이 대문자 B로 출력

        System.out.println("=== double[] doubleArray ===");
        double[] doubleArray = new double[3];
        System.out.println(doubleArray[0]); // 0.0이 double 의 기본값

        doubleArray[0] = 0.1;
        doubleArray[1] = 2.4;
        doubleArray[2] = 1.8;

        System.out.println("doubleArray: " + Arrays.toString(doubleArray));
        System.out.println("배열의 길이: " + doubleArray.length);

        // 다차원 배열 >> 선선과 초기화를 동시에
        System.out.println("=== 다차원 배열===");
        int[][] matrix = {{1, 2, 3,}, {10, 20, 30}}; //2X3
        System.out.println(matrix[0][2]); // 3
        System.out.println(matrix[1][2]); // 30

        int[][] matrix2 = new int[3][2];
        matrix2[0][0] = 1;
        matrix2[0][1] = 2;
        matrix2[1][0] = 3;
        matrix2[1][1] = 4;
        matrix2[2][0] = 5;
        matrix2[2][1] = 6;
        // {{1,2}, {3,4}, {5,6}}

        // 객체를 참조하는 배열
        // primitive 타입의 배열은 각 항목에 **값++만 저장
        // reference 타입의 배열은 각 항목에 **주소**를 저장
        String[] langs = new String[3];
        langs[0] = "Java";
        langs[1] = "Java";
        langs[2] = new String("Java");

        System.out.println(langs[0]==langs[1]); // true - 주소 비교 (문자열 리터럴)
        System.out.println(langs[1]==langs[2]); // false - 주소 비교 (문자열 리터럴과 객체)
        System.out.println(langs[0].equals(langs[2])); // true - equals눈 주소가 아닌 값을 비교함


        System.out.println("=== 배열 복사 ver1. ===");
        //------------------------- 배열 복사 -------------------------
        // ver1. for 문으로 요소 하나씩 복사
        int[] originArray = {1,2,3};
        int[] newArray = new int[5];
        System.out.println(Arrays.toString(newArray)); // [0, 0, 0, 0, 0]
        for(int i=0; i<originArray.length; i++) {
            newArray[i] = originArray[i];
        }
        System.out.println("복사 후 결과: " + Arrays.toString(newArray)); // [1, 2, 3, 0, 0]


        System.out.println("=== 배열 복사 ver2. ===");
        // ver2. arrayCogy() 메소드 사용
        // arrayCopy(Object src, int srcPos, Object dest, int destPos, int length)
        /**
         * Object src : 원본 배열
         * int srcPos : 원본배열 복사 시작 인덱스
         * Object dest : 새로운 배열
         * int destPost : 새 배열 붙여넣기 시작 인덱스
         * int length : 복사 항목 수
         */

        String[] originFruits = {"apple", "orange", "banana"};
        String[] newFruits = new String[5];
        System.out.println(Arrays.toString(newFruits)); // [null, null, null, null, null]
        System.arraycopy(originFruits, 1, newFruits,0, originFruits.length-1); // 2보다는 originFruits.length-1 사용
        System.out.println(Arrays.toString(originFruits)); // [apple, orange, banana]
        System.out.println(Arrays.toString(newFruits)); // destPost:1 => [null, orange, banana, null, null] / 0 => [orange, banana, null, null, null]


        System.out.println("=== Arrays.copyOf() ===");
        //------------------------- java,util.Arrays -------------------------
        // 1. Arrays.copyOf()
        // 처음부터 복사하되, 인자로 전달되는 길이만큼 복사
        int[] originArr = {1,2,3,4,5};
        int[] copiedArray = Arrays.copyOf(originArr, 3);
        int[] copiedArray2 = Arrays.copyOf(originArr, 7);
        System.out.println("copiedArray: " + Arrays.toString(copiedArray));
        System.out.println("copiedArray2: " + Arrays.toString(copiedArray2));

        System.out.println("=== copyOfRange(arr, sIdx, eIdx) ===");
        // 2. copyOfRange(arr, sIdx, eIdx)
        // sIdx<= copy < eIdx(포함X)
        int[] rangeArray = Arrays.copyOfRange(originArr, 1, 4);
        System.out.println(Arrays.toString(rangeArray)); // [2, 3, 4]


        System.out.println("=== fill(arr, val) ===");
        // 3. fill(arr, val): arr 의 모든 요소를 value 값으로 채우는 것
        int[] filledArray = new int[5];
        System.out.println("Filled Array (before):: " + Arrays.toString(filledArray));
        Arrays.fill(filledArray, 7);
        System.out.println("Filled Array (after):: " + Arrays.toString(filledArray));


        System.out.println("=== sort(arr) ===");
        // 4. sort(arr): 배열을 무조건 오름차순으로 정렬
        int[] unSortedArray = {5,3,1,2,4};
        Arrays.sort(unSortedArray); //실제 원본 배열이 정렬됨
        System.out.println("정렬 후: " + Arrays.toString(unSortedArray));

        // 내림차순은 reference로 해야되고 sort는 기본적으로 오름차순!
        // 참고) 내림차순 정렬시 - int가 아닌 Integer로 선언(reference type)
        Integer[] intArr1 = new Integer[]{5,7,2,4,6};
        Arrays.sort(intArr1, Collections.reverseOrder());
        System.out.println("내림차순 정렬 후: " + Arrays.toString(intArr1));

        Integer[] intArr2 = new Integer[]{5,7,2,4,6};
        Arrays.sort(intArr2, (a, b) -> b-a);;
        System.out.println("내림차순 정렬 후: " + Arrays.toString(intArr2));


        System.out.println("=== Arrays.equals(arr1, arr2) ===");
        // 5, Arrays.equals(arr1, arr2)
        // 배열의 주소가 아닌 순서에 따른 값이 일치하는지 검사
        int[] array1 = {1,2,3};
        int[] array2 = {1,2,3};
        int[] array3 = {4,5,6};
        System.out.println("Arrays 연산자(==) 비교: " + (array1==array2)); // false
        System.out.println("Arrays 연산자(==) 비교: " + (array1==array3)); // false

        boolean arrayEqual = Arrays.equals(array1, array2);
        boolean arrayEqual2 = Arrays.equals(array1, array3);
        System.out.println("Arrays Equal 메소드 비교(1,2): " + arrayEqual); // true
        System.out.println("Arrays Equal 메소드 비교(1,3): " + arrayEqual2); // false


        System.out.println("=== Arrays.deepEquals(arr1, arr2) ===");
        // 6. Arrays.deepEquals(arr1, arr2)
        int[][] deepArray1 = {{1,2},{3,4}};
        int[][] deepArray2 = {{1,2},{3,4}};
        int[][] deepArray3 = {{1,2},{3,5}};

        System.out.println("2차원 배열 비교(Equals): " + Arrays.equals(deepArray1, deepArray2)); // false
        System.out.println("2차원 배열 비교(deepEquals): " + Arrays.deepEquals(deepArray1, deepArray2)); // true
        System.out.println("2차원 배열 비교(deepEquals): " + Arrays.deepEquals(deepArray1, deepArray3)); // false


        System.out.println("=== Arrays.binarySearch(arr, value) ===");
        // 7. Arrays.binarySearch(arr, value)
        // "정렬된 배열" 기준으로 요소가 몇 번째인지 검색해주는 메소드
        int[] sortedArray = {10,30,50,70,90,99,108};
        int index = Arrays.binarySearch(sortedArray, 50); // 2
        int index2 = Arrays.binarySearch(sortedArray, 99); // 5
        int index3 = Arrays.binarySearch(sortedArray, 88); // 검색 결과가 없으면 무작위의 음수를 반환
        System.out.println("index 50: " + index);
        System.out.println("index2 99: " + index2);
        System.out.println("index3 88: " + index3);
    }
}
