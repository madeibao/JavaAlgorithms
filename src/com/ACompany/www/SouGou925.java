package com.ACompany.www;

import java.util.Scanner;

/**
 * @ClassName SouGou925
 * @Author：Mayuan
 * @Date 2020/9/25 20:36
 * @Description TODO
 * @Version 1.0
 **/

//3,1,"ABC","DDD"

public class SouGou925 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = 3;
        k = 3;
        String a = "ABC";
        String b = "ABC";
        int sum = getSameChar(a, b);
        method(n, k, sum);
        sc.close();
    }


    public static int getSameChar(String a, String b) {
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == b.charAt(i)) {
                sum++;
            }
        }
        return sum;
    }

    public static void method(int n, int k, int same) {
        int min = 0;
        int diff = n - same;
        if (diff >= k) {
            min = 0;
        } else {
            min = k - diff;
        }

        int max = 0;
        if (k <= same) {
            max = k + n - same;
        } else {
            max = same + n - k;
        }
        System.out.println("[" + min + "," + max + "]");
    }
}
