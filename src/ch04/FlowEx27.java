package ch04;

import java.util.Scanner;

public class FlowEx27 {
    public static void main(String[] args) {
        System.out.println("합계를 구할 숫자를 입력하세요.(끝내려면 0을 입력)");

        int num;
        int sum=0;
        boolean flag = true;

        Scanner scanner = new Scanner(System.in);


        while (flag) {
            System.out.println(">>");

            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num != 0) {
                sum += num;
            } else {
                flag = false;
            }

        }

        System.out.println("합계:" + sum);
    }
}
