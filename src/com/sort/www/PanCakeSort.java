package com.sort.www;

import java.util.ArrayList;
import java.util.List;

/**
 * 煎饼排序算法，记录每一个反转的位置步骤
 *
 * @ClassName PanCakeSort
 * @Author：Mayuan
 * @Date 2025/3/23/星期日 13:54
 * @Description TODO
 * @Version 1.0
 **/
public class PanCakeSort {
    public List<Integer> pancakeSort(int[] arr) {
        List<Integer> ans = new ArrayList<>();
        for (int n = arr.length; n > 1; n--) {
            int index = maxIndex(arr, n);
            // 最大的位置是最后一个，直接下一步循环
            if (index == n - 1) {
                continue;
            }
            if (index != 0) {
                ans.add(index + 1);
                flip(arr, index);
            }
            flip(arr, n - 1);
            ans.add(n);
        }
        return ans;
    }

    int maxIndex(int[] arr, int n) {
        int index = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= arr[index]) index = i;
        }
        return index;
    }

    void flip(int[] arr, int k) {
        int i = 0, j = k;
        while (i < j) {
            int tmp = arr[i];
            arr[i] = arr[j];
            arr[j] = tmp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 1};
        PanCakeSort sort = new PanCakeSort();
        System.out.println(sort.pancakeSort(nums));
    }
}
