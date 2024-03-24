package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName ArrayCheck
 * @Author：Mayuan
 * @Date 2020/2/25 11:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 设置数组回复到非递减的顺序，所需要的移动的数字的位数
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 * <p>
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：heights = [1,1,4,2,1,3]
 * 输出：3
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/height-checker
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ArrayCheck {


    public static int heightChecker(int[] heights) {
        int[] nums = new int[heights.length];
        System.arraycopy(heights, 0, nums, 0, heights.length);
        Arrays.sort(nums);
        int res = 0;
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] != nums[i]) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 4, 2, 1, 3};
        int temp = heightChecker(nums);
        System.out.println(temp);
    }
}
