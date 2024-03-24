package com.algorithm.www;

/**
 * @ClassName PerfectNumber2
 * @Author：Mayuan
 * @Date 2020/5/14 11:00
 * @Description TODO
 * @Version 1.0
 * <p>
 * 找出1000以内的所有的完数字
 **/
public class PerfectNumber2 {

    public static void function() {
        for (int i = 1; i <= 1000; i++) {
            int S = 0;
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0) {
                    S += j;
                }
            }
            if (S == i) {
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("1000以内的完全数:");
        function();
    }

}
