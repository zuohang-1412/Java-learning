package org.primary.operator;

public class LogicTest {
    public static void main(String[] args) {
        // 逻辑运算符
        // 逻辑与 & 只要有一个操作数为 false，那么结果一定是 false
        System.out.println(true & true); // true
        System.out.println(true & false); // false
        System.out.println(false & true); // false
        System.out.println(false & false); // false

        // 短路与 && 效率比 & 高一些，只要第一个操作数为 false，那么之后的表达式都不用计算，结果一定是 false
        System.out.println(true && true); // true
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(false && false); // false

        // 逻辑或 | 只要有一个操作数为true, 那么结果一定为 true
        System.out.println(true | true); // true
        System.out.println(true | false); // true
        System.out.println(false | true); // true
        System.out.println(false | false); // false

        // 短路或 || 效率比 | 高一些 只要有一个操作数为true, 后面的操作数就不用计算了，那么结果一定为 true
        System.out.println(true || true); // true
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(false || false); // false

        // 逻辑非 ! 相反结果
        System.out.println(!true); // false
        System.out.println(!false); // true

        // 逻辑异或 ^ 像个相同的操作数为false， 不同则为true
        System.out.println(true^true); // false
        System.out.println(true^false); // true
        System.out.println(false^true); // true
        System.out.println(false^false); // false

        // 例题
        int a = 8;
        System.out.println((5>7)&&(a++==1)); // false
        System.out.println(a); // 8 说明第二个表达式并没有执行

        int b = 8;
        System.out.println((5>7)&(b++==1)); // false
        System.out.println(b); // 9

        int c = 8;
        System.out.println((5<7)&&(c++==8)); // true
        System.out.println(c); // 9

        int d = 8;
        System.out.println((5<7)&(d++==8)); // true
        System.out.println(d); // 9

        int e = 8;
        System.out.println((5<7)&(++e==8)); // false
        System.out.println(e); // 9
    }
}
