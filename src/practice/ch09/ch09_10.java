package practice.ch09;

public class ch09_10 {

    public static String format(String str, int length, int alignment) {
        if (length < str.length()) {
            return str.substring(0, length);
        }

        char[] chArr = new char[length];

        for (int i = 0; i < chArr.length; i++) {
            chArr[i] = ' ';
        }
        return new String();
    }


    public static void main(String[] args) {
        String str = "가나다 ";
        System.out.println(format(str,7,0)); // 왼쪽 정렬
        System.out.println(format(str,7,1)); // 가운데 정렬
        System.out.println(format(str,7,2)); // 오른쪽 정렬
    }
}
