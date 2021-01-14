package com.shuzu.www;

/**
 * @ClassName MinIncreaseNumber
 * @Author：Mayuan
 * @Date 2020/7/11 20:55
 * @Description TODO
 * @Version 1.0
 * <p>
 * 使得数组变成严格的递增数组的需要的最少的操作次数。
 **/
public class MinIncreaseNumber {
    static long increasingArray(int[] array) {
        long res = 0;
        for (int i = 1; i < array.length; i++) {
            int difference = array[i] - array[i - 1];
            if (difference <= 0) {
                res += 1 - difference;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = {1, 4, 5};
        System.out.println(increasingArray(res));
    }
}
