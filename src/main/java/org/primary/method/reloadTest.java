package org.primary.method;

public class reloadTest {
    public static void main(String[] args) {
        add(3,5);
        add(3,4,5);
        add(3.4,9.8);
    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b+c;
    }
    public static double add(double a, double b){
        return a+b;
    }
}
