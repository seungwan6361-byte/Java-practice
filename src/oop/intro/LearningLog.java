package oop.intro;


public class LearningLog {


    String title;
    int minuites;
    boolean publiclog;



    void printSummary() {
        System.out.println(title + " - " + minuites + " 분");
    }

    boolean needReview() {
        return minuites < 60;
    }

}
