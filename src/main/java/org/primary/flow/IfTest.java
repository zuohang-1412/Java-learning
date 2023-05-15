package org.primary.flow;

public class IfTest {

    public static void main(String[] args) {
        double i = Math.random(); // [0.0,1.0) 随机数
        i = i * 100; // [0.0, 100)
        int a = (int) i; // [0,99]
        a = a + 1; // [1,100]
        // if 单分支
        if (a > 5) {
            System.out.println(a + "大于 5 ");
        }
        // if 双分支
        if (a % 2 == 0) {
            System.out.println(a + "是偶数");
        } else {
            System.out.println(a + "奇数");
        }
        // if 多分支
        if (a % 3 == 0) {
            System.out.println(a + "能被2整除");
        } else if (a % 4 == 0) {
            System.out.println(a + "能被3整除");
        } else if (a % 5 == 0) {
            System.out.println(a + "能被5整除");
        } else {
            System.out.println(a + "不能被3、4、5 整除");
        }
    }
}
