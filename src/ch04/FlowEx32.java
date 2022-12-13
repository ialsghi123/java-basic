package ch04;

import java.util.Scanner;

public class FlowEx32 {
    public static void main(String[] args) {

        int num;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("(1) square");
            System.out.println("(2) square root");
            System.out.println("(3) log");

            System.out.println("원하는 메뉴(1~3)를 선택하세요.(종료:0)>");
            String tmp = scanner.nextLine();
            num = Integer.parseInt(tmp);

            if (num < 1 || num > 3) {
                System.out.println("메뉴를 잘못선택하셨습니다. (종료는 0)");
                continue;
            } else if (1 <= num && num <= 3) {
                System.out.println("선택하신 메뉴는 "+ num + "번입니다.");
            } else if (num == 0) {
                System.out.println("프로그램을 종료합니다");
                break;
            }

        }



    }
}
