package org.primary.type;

public class DoubleTest {
    public static void main(String[] args) {
        // 浮点型常量有两种形式
        double d1 = 3.14; // 十进制形式
        System.out.println(d1);
        double d2 = 314E-2; // 科学计数法形式
        System.out.println(d2);

        // 浮点类型变量
        float f1 = 3.1415926535897932384626433F; // 默认是double 类型，如果想使用float 需要在浮点数后加上F或f, 但是精度会变低
        System.out.println(f1); // 3.1415927

        double d3 = 3.1415926535897932384626433D; // double 类型是在浮点数后加上D或d, 默认不加就是double 类型
        System.out.println(d3); // 3.141592653589793

    }
}
