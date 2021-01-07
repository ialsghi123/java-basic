package practice;

/*

[6-7] 문제 에서 작성한 클래스메서드 를 클래스의 인스턴스메서 6-6 getDistance() MyPoint
드로 정의하시오.

[ ] 실행결과
1.4142135623730951
 */
class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /*
    (1) getDistance . 인스턴스메서드 를 작성하시오
    */

    double getDistance(int x, int y) {
        return Math.sqrt((x - this.x) * (x - this.x) + (y - this.y) * (y - this.y));
    }
}


public class Exercise6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
// p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(2,2));

    }
}
