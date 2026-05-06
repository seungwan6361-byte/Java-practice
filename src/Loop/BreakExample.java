package Loop;

public class BreakExample {

    public static void main(String[] args) {

    for (int i = 1; i <= 10; i++) {
        // 블록 내에 코드가 한 줄인 경우에는 괄호 생략이 가능합니다. (두줄은 안됩니다!!)
        if (i == 5)
            break; // 조건문 과 함께 자주 쓰임

        System.out.print(i + " ");

    }

        System.out.println("\n================================================================");

    outer: for (int i = 0; i <= 2; i++) {
        for (int j = 0; j <= i; j++) {
            if (i == j) break outer;
            System.out.println(i + "-" + j);
        }


    }

    }

}
