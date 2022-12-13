package ch09;

public class WrapperEx3 {
    public static void main(String[] args) {
        int i = 10;

        Integer intg = (Integer) i;
        Object obj = (Object) i;

        Long lng = 100L;

        int i2 = intg + 10;
        long l = intg + lng;

        Integer intg2 = new Integer(20);
        int i3 = (int) intg2;

        Integer intg3 = intg2 + i3;

        System.out.println("i = " + i);
        System.out.println("i = " + intg);
        System.out.println("i = " + obj);
        System.out.println("i = " + i2);
        System.out.println("i = " + l);
        System.out.println("i = " + intg2);
        System.out.println("i = " + i3);
        System.out.println("i = " + intg3);

    }
}
