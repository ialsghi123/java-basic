package ch01_02;

public class OverflowEx {
    public static void main(String[] args) {
        short sMin = -32768;
        short sMax = 32767;
        char  cMin = 0;
        char  cMax = 65535;

        int max = 2147483647;
        int min = -2147483648;

        System.out.println("sMin  = " + sMin);
        System.out.println("sMin-1= " + (short)(sMin-1));
        System.out.println("sMax  = " + sMax);
        System.out.println("sMax+1= " + (short)(sMax+1));
        System.out.println("cMin  = " + (int)cMin);
        System.out.println("cMin-1= " + (int)--cMin);
        System.out.println("cMax  = " + (int)cMax);
        System.out.println("cMax+1= " + (int) ++cMax);

        System.out.println("min = " + min);
        System.out.println("min- = " + (int)--min);
        System.out.println("max = " + max);
        System.out.println("max+ = " + ++max);

    }
}
