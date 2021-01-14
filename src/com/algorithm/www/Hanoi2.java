package com.algorithm.www;

/**
 * @ClassName Hanoi2
 * @Author：Mayuan
 * @Date 2020/3/19 17:47
 * @Description TODO
 * @Version 1.0
 **/
public class Hanoi2 {

    public static void move(int n, String a, String b, String c) {
        if (n < 1) {
            System.out.println("Wrong Number <0");
        } else if (n == 1) {
            System.out.println(a + ">>" + c);
        } else {
            move(n - 1, a, c, b);
            System.out.println(a + ">>" + c);
            move(n - 1, b, a, c);
        }
    }

    public static void main(String[] args) {
        String a = "A", b = "B", c = "C";
        move(3, a, b, c);
    }
}
