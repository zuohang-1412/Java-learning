package org.primary.flow;

public class WhileTest {
    public static void main(String[] args) {
        // while 循环
        // 1+2+3+4+5 求和
        int i = 0; // 条件初始化
        int sum = 0;
        while (i <= 5) { // 条件判断
            sum += i; //  循环体
            i++; // 迭代
        }
        System.out.println(sum);

    }
}
