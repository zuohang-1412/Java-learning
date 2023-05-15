package org.primary;

public class TestShape {
    public static void main(String[] args) {
        /* 长方形
         ******
         ******
         ******
         */
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 6; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        /* 平行四边形
            ******
           ******
         ******
         */

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= (9 - i); k++) {//i:控制空格的个数
                System.out.print(" ");
            }
            for (int j = 1; j <= 6; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        /* 三角形
            *
           ***
          *****
         */

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= (9 - i); k++) {//i:控制空格的个数
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        /* 菱形
           *
          ***
         *****
          ***
           *
         */

        for (int i = 1; i <= 3; i++) {
            for (int k = 1; k <= (9 - i); k++) {//i:控制空格的个数
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 2; i >= 1; i--) {
            for (int k = 1; k <= (9 - i); k++) {//i:控制空格的个数
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*i-1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}
