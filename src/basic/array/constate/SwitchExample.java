package basic.array.constate;

public class SwitchExample {

    public static void main(String[] args) {
        // == 좌항우항 동일, = 대입, ! not,
        String gender = "f";

        // If 문처럼 논리형 조건식이 들어가는 게 아니라
        // 분기를 나눌 기준값이 괄호 안에 들어갑니다. (문자열, 정수만 가능)
        switch (gender) {
            case "m": case "M": case "남": case "ㅡ":
                System.out.println("남자입니다.");
                break; // 해당 케이스만 실행하고 스위치 문을 종료해라
        // Java 14버전 이후 개선된 case 문
            case "F", "f", "여", "ㄹ":
                System.out.println("여자입니다.");
                break;

            default:
                System.out.println("잘못된 입력입니다.");

        }

    }

}
