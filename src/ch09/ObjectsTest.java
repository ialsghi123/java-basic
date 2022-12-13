package ch09;

import java.util.*;

public class ObjectsTest {
    public static void main(String[] args) {
        String[][] str2D = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};
        String[][] str2D_2 = new String[][]{{"aaa", "bbb"}, {"AAA", "BBB"}};

        for (String[] tmp : str2D) {
            System.out.println(Arrays.toString(tmp));
        }

    }
}
