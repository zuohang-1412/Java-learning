package org.primary.type;

public class BooleanTest {
    public static void main(String[] args) {
        // 创建 布尔类型变量， 在内存中占一位（不是一个字节）
        boolean f1 = true;
        System.out.println(f1); // true
        boolean f2 = false;
        System.out.println(f2); //false
        boolean f3 = 5==9;
        System.out.println(f3); //false
        boolean f4 = 5<=9;
        System.out.println(f4); // true
    }
}
