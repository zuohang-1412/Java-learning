package org.primary.type;

public class IntTest {
    public static void main(String[] args) {
        // 定义整数型变量
        int num1 = 10; // 默认情况下是十进制
        System.out.println(num1); // 10
        int num2 = 0b10; // 前面加上 0B 或者 0b，是2进制
        System.out.println(num2); // 2
        int num3 = 0773; // 前面加上 0，是8进制
        System.out.println(num3); // 507
        int num4 = 0xaff; // 前面加上 0X 或者 0x，是16进制
        System.out.println(num4); // 2815

        // 定义 byte 类型 （-2^7 至 2^7-1）
        byte b = 126; // 超出范围会报错
        System.out.println(b); // 126

        // 定义 short 类型 (-2^15 至 2^15-1)
        short s = 30000;
        System.out.println(s);

        // 定义 int 类型 (-2^31 至 2^31-1)
        int i = 1234;
        System.out.println(i);

        // 定义 long 类型 (-2^63 至 2^63-1)
        long l1 = 12345678910L;
        System.out.println(l1);
        long l2 = 1234567891;
        System.out.println(l2); // 如果 l 的长度小于int 长度时，不用特别标注L， 但是如果大于int 长度就必须标注L，否则会报错。
    }
}
