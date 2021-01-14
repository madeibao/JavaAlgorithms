package com.algorithm.www;

import java.util.HashMap;

/**
 * @ClassName MaxNumber3
 * @Author：Mayuan
 * @Date 2020/9/16 21:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 交换两个数字来组成的最大的数字。
 **/
public class MaxNumber3 {
    public static int maximumSwap(int num) {
        char[] chars = String.valueOf(num).toCharArray();
        HashMap<Character, Integer> cache = new HashMap<>();
        //保留位置
        for (int i = 0; i < chars.length; i++) {
            cache.put(chars[i], i);
        }
        for (int i = 0; i < chars.length; i++) {
            char cur = chars[i];
            if (cur == '9') {
                continue;
            }
            for (char j = '9'; j > cur; j--) {
                if (cache.containsKey(j) && cache.get(j) > i) {
                    swap(chars, i, cache.get(j));
                    return Integer.valueOf(String.valueOf(chars));
                }
            }
        }
        return num;
    }

    private static void swap(char[] c, int i, int j) {
        char tmp = c[i];
        c[i] = c[j];
        c[j] = tmp;
    }

    public static void main(String[] args) {
        int num = 3245;
        System.out.println(maximumSwap(num));
    }
}
