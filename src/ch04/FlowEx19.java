package ch04;

public class FlowEx19 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                for (int k = 1; k <= 9; k++) {
                    System.out.printf("%d%d%d\n",i,j,k);
                }
            }
        }
    }
}
