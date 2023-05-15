package org.primary.type;

public class CharTest {
    public static void main(String[] args) {
        // 定义字符类型的变量 (字符类型：单引号引起来的单个字符)
        // java 中无论字母、数字、符号、中文都是字符类型的常量，都占用2个字节
        char c1 = 'a';
        System.out.println(c1);

        char c2 = 'A';
        System.out.println(c2);

        char c3 = '4';
        System.out.println(c3);

        char c4 = '爱';
        System.out.println(c4);

        char c5 = '?';
        System.out.println(c5);

        char c6 = ' ';
        System.out.println(c6);
    }
}
