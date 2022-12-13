package ch05;

public class ArrayEx7 {
    public static void main(String[] args) {

        int arr[] = new int[10];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.print(arr[i]);
        }
        System.out.println();

        for (int i = 0; i < 100; i++) {

            int k = (int) (Math.random() * 10);
            tmp = arr[0];
            arr[0] = arr[k];
            arr[k] = tmp;

        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }


    }
}
