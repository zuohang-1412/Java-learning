package org.primary.flow;

public class BreakTest {
    public static void main(String[] args) {
        // break  1 2 3 4
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        // break 结束
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == 10) {
                    break;
                }
                System.out.println("i: " + i + "\t" +"j: " + j); // 只是没有 2，5；5，2，说明只终止了一层for循环
            }
        }
        // break 多层
        outer:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j < 10; j++) {
                if (i * j == 10) {
                    break outer;
                }
                System.out.println("i: " + i + "\t" +"j: " + j); // 就输出到2 4， 之后就不在输出了。
            }
        }
    }
}
