package practice;

import java.util.HashSet;
import java.util.TreeSet;

public class HashSetEx {

    public static void main(String[] args) {

        HashSet set = new HashSet();


        set.add("123");
        set.add(new Person("minho", 20));

        System.out.println(set); 

        TreeSet set1 = new TreeSet();

        for(int i=0; set1.size()<6; i++) {
            int num = (int) (Math.random() * 45) + 1;
            set1.add(num);
        }

        System.out.println(set1);


    }
}

class Person {

    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
