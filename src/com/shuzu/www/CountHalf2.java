package com.shuzu.www;

/**
 * @ClassName CountHalf2
 * @Author：Mayuan
 * @Date 2020/6/18 20:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 统计数组中出现次数超过一半的那个数字，然后返回。
 * <p>
 * 方法，投票算法。
 **/
public class CountHalf2 {
    private static int findNumHalf(int[] arr) {
        if (arr == null || arr.length <= 0) {
            return -1; // Invalid.
        }

        int cur = arr[0];
        int cnt = 0;

        for (int i = 1; i < arr.length; i++) {
            if (cur == arr[i]) {
                cnt++;
            } else if (cnt == 0) {
                cur = arr[i];
                cnt++;
            } else {
                cnt--;
            }
        }
        return cur;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(findNumHalf(nums));
    }

}
