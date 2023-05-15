package org.primary.list;

import java.util.Arrays;

public class pushTest {
    public static void main(String[] args) {
        // 第一种
        int[] arr = new int[4];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        System.out.println(Arrays.toString(arr));
        // 第二种
        int arr1[] = new int[10];
        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;
        arr1[3] = 4;
        System.out.println(Arrays.toString(arr1));
        // 第三种
        int[] arr2 = {1, 2, 3, 4};
        System.out.println(Arrays.toString(arr2));

    }
}
