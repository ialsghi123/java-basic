package practice;

public class MethodEx {

    public static void main(String[] args) {

        MyMath math = new MyMath();

        System.out.println(math.max(4, 7));

        System.out.println(math.add(2));

        MyMath2 math2 = new MyMath2();

        int result=MyMath2.add(3,5);
        System.out.println(result);

    }

}

class MyMath {
    int max(int a, int b) {
        return a > b ? a : b;
    }

    int add(int a) {
        if(a>3) {
            return -1;
        } else {
            return 1;
        }
    }
}

class MyMath2 {
    int a,b;

    int add1(int a, int b) {
        return a+b;
    }

    static int add(int a, int b) {

        return a + b;
    }


}
