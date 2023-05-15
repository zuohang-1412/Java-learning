package org.primary.flow;

public class ForTest {
    public static void main(String[] args) {
        // for
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
            System.out.print(i + "\t" + sum + "\n");
        }
    }
}
