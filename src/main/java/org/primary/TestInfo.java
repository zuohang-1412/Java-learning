package org.primary;

import java.sql.SQLOutput;
import java.util.Scanner;

public class TestInfo {
    public static void main(String[] args) {
        // 输入用户相关信息
        System.out.println("输入学生相关信息");
        Scanner sc = new Scanner(System.in);
        System.out.print("学生姓名：");
        String name = sc.next();
        System.out.print("学生年龄：");
        int age = sc.nextInt();
        System.out.print("学生身高：");
        double height = sc.nextDouble();
        System.out.print("学生性别：");  // 男 女 可以转化为 char
        char sex = sc.next().charAt(0);

        System.out.println("该学生的信息为:姓名是：" + name + ",年龄是：" + age + ",身高为：" + height + ",性别是：" + sex);
    }
}
