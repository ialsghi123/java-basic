package practice.ch04;

public class ch4_15 {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result =0; // number 변수 를 거꾸로 변환해서 담을 변수
        while(tmp !=0) {

            result = result * 10 + tmp % 10;
            tmp = tmp / 10;
        }
        if(number == result)
            System.out.println( number + "는 화문수 입니다.");
        else
            System.out.println( number + "는 화문수가 아닙니다.");
    }
}
