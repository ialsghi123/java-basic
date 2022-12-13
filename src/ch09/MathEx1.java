package ch09;

import static java.lang.Math.*;

public class MathEx1 {
    public static void main(String[] args) {
        double val = 90.7552;
        System.out.println(round(val));

        val *= 100;
        System.out.println(round(val));

        System.out.println(round(val) / 100);
        System.out.println(round(val) / 100.0);
        System.out.println();

        System.out.printf("%3.1f=%3.1f\n", 1.1, ceil(1.1));

    }
}
