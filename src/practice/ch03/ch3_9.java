package practice.ch03;

public class ch3_9 {
    public static void main(String[] args) {
        char ch = 'z';
        boolean b = (ch >= '0' && ch <= '9') || (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
        System.out.println(b);

    }
}
