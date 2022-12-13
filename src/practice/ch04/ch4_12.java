package practice.ch04;

public class ch4_12 {
    public static void main(String[] args) {

        for (int i = 1; i <= 3; i++) {
            for (int j = 2; j <= 4; j++) {
                System.out.printf("%d*%d=%d\t", j, i, i * j);
            }
            System.out.println();
        }
    }
}
