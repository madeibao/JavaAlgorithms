package com.shuzu.www;

/**
 * @ClassName MajorityNumber3
 * @Author：Mayuan
 * @Date 2020/2/21 20:33
 * @Description TODO
 * @Version 1.0
 * 求一个数组中占据数组内容一半的元素
 * 这个元素内容超过元素的一半以上。
 **/
public class MajorityNumber3 {

    private static int majority(int[] nums) {
        //初始化为数组的第一个元素，接下来用于记录上一次访问的值
        int target = nums[0];

        // 用于记录次数。
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (target == nums[i]) {
                count++;
            } else {
                count--;
            }
            //当count=0时，更换target的值为当前访问的数组元素的值，次数设为1
            if (count == 0) {
                target = nums[i];
                count = 1;
            }
        }

        // 返回目标内容。
        return target;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(majority(nums));
    }
}
