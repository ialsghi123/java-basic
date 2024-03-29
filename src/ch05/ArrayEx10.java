package ch05;

public class ArrayEx10 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int tmp = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] = (int) (Math.random() * 10));
        }
        System.out.println();

        for (int i = 0; i < arr.length - 1; i++) {
            boolean changed = false;

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tmp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tmp;
                    changed = true;
                }
            }

            if (!changed) {
                break;
            }

            for (int k = 0; k < arr.length; k++) {
                System.out.print(arr[k]);
            }
            System.out.println();


        }
    }
}
