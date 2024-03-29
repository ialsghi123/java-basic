package practice.ch05;

import java.util.Scanner;

public class ch5_7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // . . 문자열을 숫자로 변환한다 입력한 값이 숫자가 아닐 경우 예외가 발생한다
        while(true) {
            System.out.println("money를 입력해주세요.>(00종료)");
            String str = scanner.nextLine();
            int money = Integer.parseInt(str);

            if (money == 00) {
                break;
            }

            System.out.println("money="+money);
            int[] coinUnit = {500, 100, 50, 10 }; // 동전의 단위
            int[] coin = {5, 5, 5, 5}; // 단위별 동전의 개수
            for (int i = 0; i < coinUnit.length; i++) {

                int coinNum = 0;
                coinNum = money / coinUnit[i];
                if (coinNum > coin[i]) {
                    coinNum = coin[i];
                }
                coin[i] = coin[i] - coinNum;

                money -= coinNum * coinUnit[i];

                System.out.println(coinUnit[i] + "원 : " + coinNum);
            }
            if(money > 0) {
                System.out.println("거스름돈이 부족합니다.");
                System.exit(0); // . 프로그램을 종료한다
            }
            System.out.println("=남은 동전의 개수 =");
            for (int i = 0; i < coinUnit.length; i++) {
                System.out.println(coinUnit[i] + "원 :" + coin[i]);
            }

        }
    }
}
