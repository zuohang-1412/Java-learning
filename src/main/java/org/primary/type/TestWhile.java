package org.primary.type;

public class TestWhile {
    public static void main(String[] args) {
        // 1+2+3+4+...+100=?
        int i = 1;
        int sum = 0;
        while (i <= 100) {
            sum += i;
            i++;
        }
        System.out.println(sum); // 5050

        // 2+4+6+8+...+100=?
        int j = 2;
        int sum2 = 0;
        while (j <= 100) {
            sum2 += j;
            j += 2;
        }
        System.out.println(sum2); // 2550

        // 5+10+15+20+...+100=？
        int k = 2;
        int sum3 = 0;
        while (k <= 100) {
            sum3 += k;
            k += 5;
        }
        System.out.println(sum3); // 990

        // 1*3*5*7*9*11 = ？
        int l = 1;
        int sum4 = 1;
        while (l <= 11) {
            sum4 *= l;
            l += 2;
        }
        System.out.println(sum4); // 10395

        // 99+98+97+96+...+1 = ?
        int m = 99;
        int sum5 = 0;
        while (m >= 1) {
            sum5 += m;
            m--;
        }
        System.out.println(sum5); // 4950
    }
}
