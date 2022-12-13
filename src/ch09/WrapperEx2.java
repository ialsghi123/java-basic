package ch09;

public class WrapperEx2 {
    public static void main(String[] args) {
        int i = new Integer("100").intValue();
        int i2 = Integer.parseInt("100");
        int i3 = Integer.valueOf("100");

        int i4 = Integer.parseInt("100", 2);
        int i5 = Integer.parseInt("100", 8);
        int i6 = Integer.parseInt("100", 16);
        int i7 = Integer.parseInt("FF", 16);

        Integer i9 = Integer.valueOf("100", 2);
        Integer i10 = Integer.valueOf("100", 8);
        Integer i11 = Integer.valueOf("100", 16);
        Integer i12 = Integer.valueOf("FF", 16);

        System.out.println("i = " + i);
        System.out.println("i = " + i2);
        System.out.println("i = " + i3);
        System.out.println("i = " + i4);
        System.out.println("i = " + i5);
        System.out.println("i = " + i6);
        System.out.println("i = " + i7);
        System.out.println("i = " + i9);
        System.out.println("i = " + i10);
        System.out.println("i = " + i11);
        System.out.println("i = " + i12);

    }
}
