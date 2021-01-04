package practice;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListEx1 {

    public static void main(String[] args) {

        ArrayList list1 = new ArrayList(10);

        list1.add(new Integer(5));
        list1.add(new Integer(3));
        list1.add(new Integer(2));
        list1.add(new Integer(4));
        list1.add(new Integer(1));

        ArrayList list2 = new ArrayList(list1.subList(0, 3));
        System.out.println(list1);
        System.out.println(list2);

        Collections.sort(list1);
        Collections.sort(list2);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("list1.containsAll(list2):"+list1.containsAll(list2));
        System.out.println("list2.containsAll(list1):"+list2.containsAll(list1));

        list2.add("A");
        list2.add("B");

        System.out.println(list1);
        System.out.println(list2);

        list2.set(3, "AAAAA");

        System.out.println();
        System.out.println("list1.retainAll(list2):"+list1.retainAll(list2));
        System.out.println(list1);



    }

}
