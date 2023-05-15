package org.primary.operator;

public class CalTest {
    public static void main(String[] args) {
        // / 和 %
        // /：表示两个数相除运算
        // %：用来求余数的
        System.out.println(12/3); // 4
        System.out.println(12%5); // 2
        System.out.println(12/3.0); // 4.0
        System.out.println(12%5.0); // 2.0

        int i = 1234;
        System.out.println("个位数是：" + i % 10); // 4
        System.out.println("十位数是：" + i / 10 % 10); // 3
        System.out.println("百位数是：" + i / 100 % 10); // 2
        System.out.println("千位数是：" + i / 1000 % 10); // 1

        // +：表示正数； 两个数相加；字符串拼接
        System.out.println(+5); // 5
        System.out.println(5 + 6); // 11
        System.out.println(5 + '6'); // 59
        System.out.println("07" + 5); // 075
        System.out.println(5 + "7"); // 57
        System.out.println(5 + 6 + "7"); // 117
        System.out.println(5 + '6' + "7"); // 597
        System.out.println("5" + 6 + "7"); // 567
        System.out.println("5" + '6' + "7"); // 567
        System.out.println("5" + '6' + '7'); // 567

        /*
         ++
         1. ++单独使用的时候，无论放在前还是后，都是加1操作
         2. 看++在前还是在后，如果++在后：先运算，后加1; 如果++在前，先加1，后运算
         */
        int a = 5;
        a++; //理解为：相当于  a=a+1 操作
        System.out.println(a); // 6

        a = 5;
        ++a; //理解为：相当于  a=a+1 操作
        System.out.println(a); // 6

        a = 5;
        int m = a++ + 7; //先运算  m=a+7  再加1：  a = a+1
        System.out.println(m); // 12
        System.out.println(a); // 6

        a = 5;
        m = ++a + 7; // 先运算  m=a+7  再加1：  a = a+1
        System.out.println(m); // 12
        System.out.println(a); // 6

        // 经典例题
        a = 5;
        System.out.println(a++ + a++); // 5 + 6 = 11； a=7
        System.out.println(a++ + ++a); // 7 + 9 = 16； a=9
        System.out.println(++a + a++); // 10 + 10 = 20 a = 11
        System.out.println(++a + ++a); // 12 + 13 = 25 a = 13

        
    }
}
