package org.primary.type;

public class TransformTest {
    public static void main(String[] args) {
        double d1 = 6; // int->double
        System.out.println(d1);
        int i1 = (int)3.14; // double->int 需要强制转换
        System.out.println(i1);
        // 多类型 转化会自动转化为类型中最高的类型
        double d2 = 2+1200L+8.5F+'a';
        System.out.println(d2); // 1307.5
    }
}
