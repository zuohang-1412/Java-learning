package org.primary.flow;

public class ContinueTest {
    public static void main(String[] args) {
        // continue 1 3 5 7 9
        for(int i =0; i<10; i++) {
            if (i%2==0) {
                continue;
            }
            System.out.println(i);
        }

        // continue 单循环
//        for(int i =0; i<10; i++) {
//            while (i==3) {
//                System.out.println("---"); // 因为是继续 所以会进入死循环
//                continue;
//            }
//            System.out.println(i);
//        }

        // continue 多循环
        outer:
        for(int i =0; i<10; i++) {
            while (i==3) {
                System.out.println("---");
                continue outer; // 因为会直接执行outer同级循环，这样就盯着把3 变为 ---
            }
            System.out.println(i);
        }
    }
}
