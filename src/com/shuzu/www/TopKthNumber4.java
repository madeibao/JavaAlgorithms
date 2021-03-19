package com.shuzu.www;

/**
 * @ClassName TopKthNumber4
 * @Author：Mayuan
 * @Date 2020/10/25 14:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组中的第k大的数据
 **/
public class TopKthNumber4 {
    public static int findKth(int[] a, int n, int K) {
        return QuickFind(a, 0, n - 1, K);
    }

    public static int QuickFind(int[] a, int lo, int hi, int k) {
        int m = partition(a, lo, hi);
        if (m + 1 > k) {
            return QuickFind(a, lo, m - 1, k);
        } else if (m + 1 < k) {
            return QuickFind(a, m + 1, hi, k);
        } else {
            return a[m];
        }
    }

    public static int partition(int[] a, int lo, int hi) {

        int temp = a[lo];
        while (lo < hi) {
            while (a[hi] <= temp && lo < hi) hi--;
            a[lo] = a[hi];
            while (a[lo] >= temp && lo < hi) lo++;
            a[hi] = a[lo];
        }
        a[lo] = temp;
        return lo;
    }

    public static void main(String[] args) {

        int[] nums = {1, 3, 5, 2, 2};
        int k = 3;
        System.out.println(findKth(nums, nums.length, k));
    }

}
