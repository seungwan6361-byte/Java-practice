package Loop;

public class ContinueExample {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            // for문에서 continue는 증감식이 실행됨.

            if (i == 5) continue;


            System.out.print(i + " ");

        }

        System.out.println("\n================================================================");

        int n = 1;
        while (n <= 10) {
            // while문에서 continue는 조건식으로 흐름이 이동한다.
            if (n == 5) continue;
            System.out.println(n + " ");
            n ++;
        }
        System.out.println("\n반복문 종료! ");
    }

}
