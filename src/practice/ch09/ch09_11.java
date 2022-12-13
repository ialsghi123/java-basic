package practice.ch09;

import java.util.Scanner;

public class ch09_11 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.println("정수를 입력해주세요.>>");
            int start = sc.nextInt();
            int end = sc.nextInt();

            if ((start < 2 || start > 9) || (end < 2 || end > 9)) {
                System.out.println("단의 범위는 2와 9사이의 값이어야 한다");
            }

            System.out.printf("%d %d\n", start, end);

            for (int i = start; i <= end; i++) {
                for (int j = 1; j <= 9; j++) {
                    System.out.printf("%d*%d=%d\n",i,j,i*j);
                }
                System.out.println();
            }
        }

    }
}
