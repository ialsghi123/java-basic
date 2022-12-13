package ch04;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int cor = (int) (Math.random() * 100) + 1;

        do {
            System.out.println("1과 100사이의 정수를 입력하세요.>");
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num > cor) {
                System.out.println("더 작은 수를 입력하세요");
            } else if (num < cor) {
                System.out.println("더 큰 수를 입력하세요");
            } else if (num == cor) {
                System.out.println("정답입니다");
            }

        } while (num != cor);


    }
}
