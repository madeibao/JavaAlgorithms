package com.string.www;

/**
 * @ClassName MinCost
 * @Author：Mayuan
 * @Date 2020/4/10 21:45
 * @Description TODO
 * @Version 1.0
 **/
public class MinCost {
    private static int compute(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        if (m != n) {
            return -1;
        }
        int[] arr1 = new int[26];
        int[] arr2 = new int[26];
        for (int i = 0; i < m; i++) {
            arr1[s1.charAt(i) - 'a']++;
            arr2[s2.charAt(i) - 'a']++;
        }

        /**
         *         如果字符对应不上
         */
        for (int i = 0; i < m; i++) {
            if (arr1[i] != arr2[i]) {
                return -1;
            }
        }

        int i = 0, j = 0;

        while (i < s1.length() && j < s2.length()) {
            char start = s2.charAt(j);
            if (s1.charAt(i) == start) {
                j++;
            }
            i++;
        }
        return s1.length() - j;
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdba";
        System.out.println(compute(s1, s2));

    }
}
