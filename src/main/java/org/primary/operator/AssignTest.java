package org.primary.operator;

public class AssignTest {
    public static void main(String[] args) {
        // 赋值 常见案例： a，b 调换
        int a = 1;
        int b = 2;
        System.out.println("交换前：" + a + " " + b);
        int tmp = a;
        a = b;
        b = tmp;
        System.out.println("交换后：" + a + " " + b);

        // 第二种：
        a = 1;
        b = 2;
        System.out.println("交换前：" + a + " " + b);
        a = a + b; // x(3) = 1 + 2；
        b = a - b; // y(1) = x(3) - 2;
        a = a - b; // x(2) = x(3) - 1;
        System.out.println("交换后：" + a + " " + b);

        // 第三种
        a = 1;
        b = 2;
        System.out.println("交换前：" + a + " " + b);
        a = a ^ b; //
        b = a ^ b; // y=(x^y)^y
        a = a ^ b; // x=(x^y)^x
        System.out.println("交换后：" + a + " " + b);

        /*
        * 出错语句
        byte a = 10;
        int b = 20;
        a+=b;
        a = a+b; 报错原因是类型需要强制转化 (byte)(a+b)
        */

    }
}
