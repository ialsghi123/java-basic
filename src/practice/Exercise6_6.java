package practice;
/*
[6-6] 두 점의 거리를 계산하는 를 완성하시오 getDistance() .
[Hint] 제곱근 계산은 를 사용하면 된다 Math.sqrt(double a) .

[ ] 실행결과
1.4142135623730951
 */
public class Exercise6_6 {
    // (x,y) (x1,y1) . 두 점 와 간의 거리를 구한다
    static double getDistance(int x, int y, int x1, int y1) {

        double a = x1 - x;
        double b = y1 - y;

        double result;
        result = a * a + b * b;

        return Math.sqrt(result);
    }
    public static void main(String args[]) {
        System.out.println(getDistance(1,1,2,2));
    }

}
