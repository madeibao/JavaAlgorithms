package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->ReplaceWithRightNumber
 * @description: 用右面的数字来取代
 * @author: MaYuan
 * @create: 2020-02-10 22:01
 * @version: 1.0
 * <p>
 * 一个数字用右面的最大的数字来取代。
 * 从右往左，通过比较max和当前值来更新max即可
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 * <p>
 * 完成所有替换操作后，请你返回这个数组。
 * 示例：
 * <p>
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/replace-elements-with-greatest-element-on-right-side
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ReplaceWithRightNumber {

    public static int[] replaceElements(int[] arr) {
        // 保留结果值的内容。
        int[] res = new int[arr.length];
        int max = -1;

        for (int i = arr.length - 1; i >= 0; i--) {
            res[i] = max;
            max = arr[i] > max ? arr[i] : max;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {17, 18, 5, 4, 6, 1};
        int[] nums2 = replaceElements(nums);
        for (int j : nums2) {
            System.out.print(j + " ");
        }
    }
}
