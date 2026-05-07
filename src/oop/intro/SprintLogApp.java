package oop.intro;

public class SprintLogApp {

    public static void main(String[] args) {

        LearningLog javalog = new LearningLog();
        javalog.title = "Java 시작"; // . : 참조하다
        javalog.minuites = 40;
        javalog.publiclog = true;

        LearningLog gitLog = new LearningLog();
        gitLog.title = " Git 복습";
        gitLog.minuites = 30;
        gitLog.publiclog = false;

        LearningLog conditionLog = new LearningLog();
        conditionLog.title = "조건문 학습";
        conditionLog.minuites = 75;
        conditionLog.publiclog = true;

        LearningLog loopLog = new LearningLog();
        loopLog.title = "반복문 학습";
        loopLog.minuites = 120;
        loopLog.publiclog = true;

        LearningLog[] logs = {javalog, gitLog, conditionLog, loopLog};

        System.out.println("==== 객체로 관리하는 학습 기록 ====");
        for (int i = 0; i < logs.length; i++) {

            logs[i].printSummary();

        }

        System.out.println();
        System.out.println("==== 복습 필요 기록 ====");
        for (LearningLog log : logs) {
            if (log.needReview()) {
                log.printSummary();
            }
        }

        System.out.println();
        System.out.println(" ==== 공개 기록 ====");
        for (LearningLog log : logs) {

            if (!log.publiclog) {
                continue;
            }
            log.printSummary();
        }


    }

}
