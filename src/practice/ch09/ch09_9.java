package practice.ch09;

public class ch09_9 {

    public static String delChar(String src, String delCh) {
        StringBuffer sb = new StringBuffer(src.length());
        return sb.toString();

    }

    public static void main(String[] args) {
        System.out.println("(1!2@3^4~5)"+" -> "
                + delChar("(1!2@3^4~5)","~!@#$%^&*()"));
        System.out.println("(1 2 3 4\t5)"+" -> "
                + delChar("(1 2 3 4\t5)"," \t"));

    }
}
