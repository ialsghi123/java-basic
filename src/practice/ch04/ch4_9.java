package practice.ch04;

public class ch4_9 {
    public static void main(String[] args) {
        String str = "12345";
        int sum = 0;
        for(int i=0; i < str.length(); i++) {
            char c = str.charAt(i);
//            System.out.println("c = " + c);
            c = (char) (c - 48);
            sum += c;

        }
        System.out.println("sum="+sum);

    }
}
