package ch04;

import java.util.Scanner;

public class FlowEx7 {
    public static void main(String[] args) {
        System.out.println("가위 바위 보 중 하나를 입력하세요.>");

        int input, com;

        Scanner scanner = new Scanner(System.in);
        String tmp = scanner.nextLine();
        input = Integer.parseInt(tmp);
        com = (int) (Math.random() * 3) + 1;
        System.out.println("당신은 " + input + "입니다");
        System.out.println("컴은 " + com + "입니다");


        switch (input - com) {
            case 0:
                System.out.println("비겼습니다");
                break;
            case 1: case -2:
                System.out.println("이겼습니다");
                break;
            case 2: case -1:
                System.out.println("졌습니다");
        }
    }
}
