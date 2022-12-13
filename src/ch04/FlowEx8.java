package ch04;

import java.util.Scanner;

public class FlowEx8 {
    public static void main(String[] args) {
        System.out.println("당신의 주민번호를 입력하세요.>");

        String tmp;

        Scanner scanner = new Scanner(System.in);
        tmp = scanner.nextLine();

        char c = tmp.charAt(7);


        switch (c) {
            case '1': case '3':
                System.out.println("남자입니다");
                break;
            case '0': case '2':
                System.out.println("여자입니다");
            default:
                System.out.println("유효하지 않은 주민등록번호입니다");

        }

    }
}
