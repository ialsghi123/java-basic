package practice.ch04;

public class ch4_10 {
    public static void main(String[] args) {
        int num = 12345;
        int sum = 0;

        for (int i = 1; i <= 5; i++) {
            int tmp = num % 10;
            sum += tmp;
            num = num / 10;

        }

        System.out.println("sum="+sum);

    }
}
