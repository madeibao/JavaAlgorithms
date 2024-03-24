package com.algorithm.www;

/**
 * @ClassName FindKthNumber
 * @Author：Mayuan
 * @Date 2020/11/10 20:47
 * @Description TODO
 * @Version 1.0
 * <p>
 * 查找数组的第k 大的数字。
 **/
public class FindKthNumber {
    public int findKth(int[] a, int n, int K) {
        // write code here
        return findKth(a, 0, n - 1, K);
    }

    public int findKth(int[] a, int low, int high, int k) {
        int part = partition(a, low, high);
        if (k == part - low + 1) {
            return a[part];
        } else if (k > part - low) {
            return findKth(a, part + 1, high, k - part + low - 1);
        } else {
            return findKth(a, low, part - 1, k);
        }
    }

    public int partition(int[] a, int low, int high) {
        int key = a[low];
        while (low < high) {
            while (low < high && a[high] <= key) high--;
            a[low] = a[high];
            while (low < high && a[low] >= key) low++;
            a[high] = a[low];
        }
        a[low] = key;
        return low;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 2, 2};
        int k = 3;
        System.out.println(new FindKthNumber().findKth(nums, nums.length, k));

    }
}
