package array;

import java.util.Arrays;

public class ArrayBasic {

    public static void main(String[] args) {
        // 1. 배열 변수 선언
        int[] numbers;

        // 2. 배열 객체 생성
        numbers = new int[5];

        // 3. 배열 내부를 초기화(이니셜라이징)
        // Index 를 지목해서 데이터를 할당.
        // 인덱스는 0 부터 시작해서 1씩 증가.
        numbers[0] = 50;
        numbers[1] = 77;
        numbers[2] = (int) 3.14; // double을 int로 변환해서 값을 할당. 소수점이 탈락됩니다.
        numbers[3] = numbers[3] + 20;
        numbers[4] = 100;


        // 4. 배열의 길이
        System.out.println("배열의 길이: " + numbers.length);

        // 5. 배열의 순회
        for (int i = 0; i < numbers.length; i++) {

            System.out.println((i + 1) + "번째 값은: " +  numbers[i] + "입니다! ");

            }

        System.out.println("==========================================================================");

        // 배열의 순회 forEach (향상된 for문)
        // 무조건 범위는 배열의 처음부터 끝까지로 설정됩니다. (중간에 break나 continue는 가능합니다.)
        for (int n : numbers) {
            System.out.println(n);
        }

        // 배열 내부를 문자열 형태로 한 번에 출력하기
        System.out.println(Arrays.toString(numbers));

        // 배열 쉽게 초기화 하기
        // 선언 당시의 크기 고정되고, 그 크기는 변할수 없습니다.
        // 혹시라도 크기를 늘리거나 줄이고 싶다면 배열을 새로 만들어서 값을 옮겨야 합니다.
        int[] pointList = {10, 20, 30, 40};
        String[] pets = {"멍멍이", "고양이", "짹쨱이", "춘식이"};
        // pets = {"멍멍이", "냐옹이", "찍찍이"}; (x)
        pets = new String[]{"멍멍이", "냐옹이", "찍찍이"}; //(o)

        }



}
