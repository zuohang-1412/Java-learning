package org.primary;

import java.util.Scanner;

public class TestPi {
    public static void main(String[] args) {
        // 输入半径长度
        Scanner sc = new Scanner(System.in);
        System.out.print("输入半径长度: ");
        int r = sc.nextInt();
        // 常量设置
        final double PI = 3.14;
        // 周长
        double c = 2*PI*r;
        System.out.println("周长是："+ c);
        // 面积
        double s = PI*r*r;
        System.out.println("面积是："+ s);
    }
}
