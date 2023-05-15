package org.primary.flow;

public class DowhileTest {

    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        }while(i<=100);
        System.out.println(sum); // 5050
        System.out.println(i); // 101

        // 如果 i 开始就大于100 应该怎么办
        i = 101;
        sum = 0;
        do {
            sum += i;
            i++;
        }while(i<=100);
        System.out.println(sum); // 101
        System.out.println(i); // 102
        // 说明 do-while 和 while 不同的是
        // do-while 先执行后判断
        // while 先判断后执行
    }
}
