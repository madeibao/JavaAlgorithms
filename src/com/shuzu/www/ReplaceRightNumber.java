package com.shuzu.www;

/**
 * @ClassName ReplaceRightNumber
 * @Author：Mayuan
 * @Date 2020/2/18 14:48
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组用右面的最大的数字来进行取代。
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 * <p>
 * 从后面来推导前面。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ReplaceRightNumber {

    public static int[] replaceElements(int[] arr) {
        int max = -1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = max;
            if (temp > max) {
                max = temp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {17, 18, 5, 4, 6, 1};
        int[] arr2 = replaceElements(arr);


        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
