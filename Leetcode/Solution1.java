import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String arrA = scanner.nextLine();
        arrA = arrA.substring(3, arrA.length() - 1);
        String[] arr_a = arrA.split(",");
        int[] arr1 = new int[arr_a.length];
        for (int i = 0; i < arr_a.length; i++) {
            arr1[i] = Integer.parseInt(arr_a[i]);
            System.out.println(arr1[i]);
        }
        String arrB = scanner.nextLine();
        arrB = arrB.substring(3, arrB.length() - 1); 
        String[] arr_b = arrB.split(",");
        int[] arr2 = new int[arr_b.length];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = Integer.parseInt(arr_b[i]);
            System.out.println(arr2[i]);
        }
        int[] res = new int[arr1.length + arr2.length];
        int pointer1 = 0;
        int pointer2 = 0;
        int len = Math.min(arr1.length, arr2.length);
        for (int i = 0; i < 2*len; i++) {
            if (i % 2 == 0) {
                res[i] = arr1[pointer1];
                pointer1++;
            } else {
                res[i] = arr2[pointer2++];
            }
        }
        if (arr1.length < arr2.length) {
            for (int i = pointer2; i < arr2.length; i++) {
                res[pointer1 + i] = arr2[i];
            } 
        } else {
            for (int i = pointer1; i < arr1.length; i++) {
                res[pointer2 + i] = arr1[i];
            }
        }
        
        System.out.print('[');
        for (int i = 0; i < res.length - 1; i++) {
            System.out.print(res[i] + ",");
        }
        System.out.print(res[res.length - 1]);
        System.out.print( ']');
    }
}
