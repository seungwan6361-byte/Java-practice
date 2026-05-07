package oop.constructor;


public class LearningLog {


    String title;
    int minuites;
    boolean publiclog;

    // 생성자는 클래스의 이름과 대/소문자까지 완전히 일치해야 합니다.
    // 그리고 메서드와 달리 리턴 타입이 존재하지 않습니다.
    LearningLog() {
        System.out.println("기본 생성자 호출!");

    }

    // 생성자는 중복 선언 가능합니다. (오버로딩: overloading)
    // 이름이 동일하기 때문에 전달하는 값의 개수, 순서, 타입을 다르게 작성해야 중복 선언을 인정합니다.
    LearningLog(String title, int minuites) {
        // this 괄호 문법으로 자기 자신의 다른 생성자를 호출하는 것이 가능하다.
        this(title, minuites, true);

    }

    // 생성자는 메서드처럼 매개값을 전달받을 수 있습니다.
    // 전달받은 값을 이용해서 필드를 초기화 할 수 있습니다.
    LearningLog(String title, int minuites, boolean publiclog) {
        // this 는 형재 객체 자기 자신을 뜻합니다.
        // 생성자에서의 this는 곧 지금 생성자에 의해 생성되고 있는 그 객체를 의미합니다.
        // 필드와 생성자의 매개변수
        this.title = title;
        this.minuites = minuites;
        this.publiclog = publiclog;

    }

    void printSummary() {
        System.out.println(title + " - " + minuites + " 분");
    }


    boolean needReview() {
        return minuites < 60;
    }

}
