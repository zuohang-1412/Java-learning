package org.primary.flow;

public class SwitchTest {
    public static void main(String[] args) {
        // switch 只能判断 字符串和整数（long除外）
        double i = Math.random()*101; // [0,100]
        int score = (int)i;

        System.out.println(score);
        switch(score/10) {
            case 10:
                /*
                System.out.println("A");
                break;
                因为具有延续性所以可以使用9 的输出
                */
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            case 5:
                /*
                System.out.println("E");
                break;
                因为具有延续性所以可以使用1 的输出
                */
            case 4:
                /*
                System.out.println("E");
                break;
                因为具有延续性所以可以使用1 的输出
                */
            case 3:
                /*
                System.out.println("E");
                break;
                因为具有延续性所以可以使用1 的输出
                */
            case 2:
                /*
                System.out.println("E");
                break;
                因为具有延续性所以可以使用1 的输出
                */
            case 1:
                System.out.println("E");
                break;
            default:
                System.out.println("成绩错误："+ score);
        }

    }
}
