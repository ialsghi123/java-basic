package practice.ch06;

class MyPoint {
    int x;
    int y;
    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(int i, int i1) {
        return Math.sqrt(Math.pow(i - x, 2) + Math.pow(i1 - y, 2));
    }
}


public class ch6_7 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        // p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(2,2));

    }
}
