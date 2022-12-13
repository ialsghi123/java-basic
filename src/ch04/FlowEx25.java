package ch04;

import java.util.Scanner;

public class FlowEx25 {
    public static void main(String[] args) {
        System.out.println("숫자를 입력하세요.(예:12345)>");

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        int num = Integer.parseInt(tmp);

        int sum = 0;

        while (num != 0) {
            sum += num % 10;

            System.out.println("sum = " + sum + " num = " + num);
            num = num / 10;
        }
        System.out.println("각 자리수의 합:" + sum);
    }
}
