package com.shuzu.www;

/**
 * @program: JavaWorkSpace2->MissingNumber
 * @description: 返回数组中的丢失的数字内容
 * @author: MaYuan
 * @create: 2020-01-02 21:13
 * @version: 1.0
 **/
public class MissingNumber {
    public int missingNumber(int[] nums) {
        //解法一 排序
        // Arrays.sort(nums);
        // for(int i = 0; i < nums.length; i++) {
        //     if(nums[i] != i) return i;
        // }
        // return nums.length;

        //解法二 哈希表
        // Set<Integer> set = new HashSet<>();
        // for(int i = 0; i < nums.length; i++) set.add(nums[i]);
        // for(int i = 0; i <= nums.length; i++)
        //     if(!set.contains(i)) return i;
        // return -1;

        //解法三 位运算
        // int res = nums.length;
        // for(int i = 0; i < nums.length; i++) {
        //     res ^= nums[i] ^ i;
        // }
        // return res;

        // 解法四 数学
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        return nums.length * (nums.length + 1) / 2 - sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 2, 4, 5, 6};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
