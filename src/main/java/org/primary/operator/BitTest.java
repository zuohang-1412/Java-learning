package org.primary.operator;

public class BitTest {
    public static void main(String[] args) {
        // 位运算
        // 左移 << x左移n位 == x*2*n
        System.out.println(3<<2); // 12

        // 有符号右移 >>
        // 6 == 0110 右移两位 变成 0001 所以输出为1 ， 最高位补0即可
        System.out.println(6>>2); // 1
        /*
        负数右移比较麻烦
        6 -> -6:
        6: 0000 0110
        取反：1111 1001
        加一：1111 1010
        得到的就是 -6
        再进行右移： __11 1110 _的位置补1 所以为 1111 1110
        想要知道这个是什么数，就需要先
        减一：1111 1101
        取反：0000 0010
        得到正数2 说明之前的数据为-2
         */
        System.out.println(-6>>2); // -2

        // 无符号右移 >>>
        System.out.println(6>>2); // 1

        // 与 &
        /*
        6: 0000 0110
        3: 0000 0011
        &: 0000 0010
         */
        System.out.println(6&3); // 2

        // 或 |
        /*
        6: 0000 0110
        3: 0000 0011
        |: 0000 0111
         */
        System.out.println(6|3); // 7

        // 异或 ^
        /*
        6: 0000 0110
        3: 0000 0011
        ^: 0000 0101
         */
        System.out.println(6^3); // 5

        // 取反 ～
        /*
        6: 0000 0110
        ～: 1111 1001 这个一定是个负数， 如果想知道是具体数值就需要
        减一： 1111 1000
        取反： 0000 0111
        这个值为 7 所以刚才的负数为-7
         */
        System.out.println(6^3); // 5

    }
}
