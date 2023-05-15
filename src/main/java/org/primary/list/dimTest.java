package org.primary.list;

import java.util.Arrays;

public class dimTest {
    // 二维数组
    public static void main(String[] args) {

        // 静态二维数组创建
        int[][] arr1 = {{1,2},{4,5,6},{4,5,6,7,8,9,9}};
        System.out.println("arr1: "); show(arr1);
        int[][] arr2 =new int[][] {{1,2},{4,5,6},{4,5,6,7,8,9,9}};
        System.out.println("arr2: "); show(arr2);
        // 动态二维数组创建
        int[][] arr3 = new int[3][];
        arr3[0] = new int[]{1,2};
        arr3[1] = new int[]{3,4,5,6};
        arr3[2] = new int[]{34,45,56};
        System.out.println("arr3: "); show(arr3);
        // 默认初始化
        int[][] arr4 = new int[3][2];
        System.out.println("arr4: "); show(arr4);
    }
    // 遍历二维数组
    public static void show(int[][] arr) {
        for(int i[]: arr) {
            System.out.println(Arrays.toString(i));
        }
    }
}
