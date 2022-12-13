package ch01_02;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'j';
        int code = (int) ch;

        System.out.printf("%c=%d(%#X) \n", ch, code, code);

        char hch = '가';
        System.out.printf("%c=%d(%#X) \n", hch, (int) hch, (int) hch);
    }
}
