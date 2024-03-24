package com.shuzu.www;

/**
 * @ClassName MinKthSegment
 * @Author：Mayuan
 * @Date 2020/7/11 20:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 将一个数组分成K段，各段和的最小值最大
 * 分段和的最小值的最大。
 * <p>
 * 二分法的思路。
 **/
public class MinKthSegment {

    public static int solve(int n, int k, int[] a) {
        // write code here
        int sum = 0;
        for (int a1 : a) {
            sum += a1;
        }
        int l = 0;
        int r = sum;
        int mid;
        while (l < r) {
            mid = (l + r) / 2;

            // 把这个值分成k段。
            if (check(mid, a) >= k) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        if (check(l, a) < k) {
            l--;
        }
        // 返回的这个值代表的就是最小值的最大和。
        return l;
    }

    public static int check(int mid, int[] a) {
        int sum = 0;
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
            if (sum >= mid) {
                sum = 0;
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int n = 4;

        // 分成两个段。
        int k = 2;
        int[] res = {1, 2, 1, 5};
        System.out.println(solve(n, k, res));
    }
}
