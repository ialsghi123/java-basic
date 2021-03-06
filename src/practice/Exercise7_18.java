package practice;


/*
[ ] 실행결과
춤을 춥니다.
노래를 합니다.
그림을 그립니다.

 */


public class Exercise7_18 {


    static void action(Robot r) {
        if(r instanceof DanceRobot) {
            ((DanceRobot) r).dance();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
        for(int i=0; i< arr.length;i++)
            action(arr[i]);
    } // main

}

class Robot {}
class DanceRobot extends Robot {
    void dance() {
        System.out.println(" 춤을 춥니다.");
    }
}
class SingRobot extends Robot {
    void sing() {
        System.out.println(" 노래를 합니다.");
    }
}
class DrawRobot extends Robot {
    void draw() {
        System.out.println(" 그림을 그립니다.");
    }
}