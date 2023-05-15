package org.primary;

public class TestChange {
    public static void change(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }
    public static void main(String[] args) {
        // 数据调换
        int a = 10;
        int b = 20;
        System.out.println(a+" "+b);
        change(a,b);
        System.out.println(a+" "+b);
        // 没有调换的原因是 change 为值传递， 当change 创建时是在栈中进行交换，并在change 结束后进行释放，并没有把相应的值在main 这个函数中进行变化。

    }
}
