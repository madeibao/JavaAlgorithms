package com.shuzu.www;

/**
 * @ClassName CombineArray
 * @Author：Mayuan
 * @Date 2020/9/26 16:49
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合并两个有序的数组。
 **/
public class CombineArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //定义一个新的数组，长度为两个原数组长度之和
        int[] newArray = new int[m + n];
        //定义三个指针，分别指向三个数组的第一个元素
        int i = 0, j = 0, count = 0;
        //当指针位置小于数组长度时，比较两个数组的元素的大小，小的放入新数组
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                newArray[count++] = nums1[i++];
            } else {
                newArray[count++] = nums2[j++];
            }
        }

        //当第一个数组遍历完成，直接将第二个数组元素放入新数组
        if (i >= m) {
            while (j < n) {
                newArray[count++] = nums2[j++];
            }
        }
        //当第一个数组遍历完成，直接将第二个数组元素放入新数组
        if (j <= n) {
            while (i < m) {
                newArray[count++] = nums1[i++];
            }
        }
        //将新数组的元素依次赋值给nums1
        for (int k = 0; k < newArray.length; k++) {
            nums1[k] = newArray[k];
        }

    }

    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1;
        while (len1 >= 0 && len2 >= 0) {
            // 注意--符号在后面，表示先进行计算再减1，这种缩写缩短了代码
            nums1[len--] = nums1[len1] > nums2[len2] ? nums1[len1--] : nums2[len2--];
        }
        // 表示将nums2数组从下标0位置开始，拷贝到nums1数组中，从下标0位置开始，长度为len2+1
        System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }

    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;
        merge2(nums1, m, nums2, n);
        for (int j : nums1) {
            System.out.print(j + " ");
        }
    }
}
