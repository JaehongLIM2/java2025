package ch05.practice;

import java.util.Arrays;

public class C01Max {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 8, 2};
//        Arrays.sort(arr);
//        System.out.println(Arrays.toString(arr));
//
//        System.out.println(arr[arr.length - 1]);


        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

    }
}
