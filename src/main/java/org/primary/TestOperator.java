package org.primary;

public class TestOperator {
    public static void main(String[] args) {
        // 赋值<三目<逻辑<关系<算术<单目
        System.out.println(5 < 6 | 'A' > 'a' && 12 * 6 <= 45 + 23 && !true);
        System.out.println(5 < 6 | 'A' > 'a' && 12 * 6 <= 45 + 23 && false); // !true = false
        System.out.println(5 < 6 | 'A' > 'a' && 72 <= 68 && false); // 12*6 = 72  45+23= 68
        System.out.println(5 < 6 | 'A' > 'a' && 72 <= 68 && false); // 5<6 = true 'A'>'a'= false
        System.out.println(true && false && false); // true | false = true
        System.out.println(false && false); // true && false = false
        System.out.println(false); // false && false = false
    }
}
