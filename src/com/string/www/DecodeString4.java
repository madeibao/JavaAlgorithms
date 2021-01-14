package com.string.www;

/**
 * @ClassName DecodeString4
 * @Author：Mayuan
 * @Date 2020/6/9 22:23
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的加密
 * a 0
 * b 1
 * c 2
 * <p>
 * z 25
 * <p>
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，
 * 1 * 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。
 * 请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * * 示例 1:
 * <p>
 * 输入: 12258
 * 输出: 5
 * 解释: 12258有5种不同的翻译，分别是"bccfi", "bwfi", "bczi", "mcfi"和"mzi"
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class DecodeString4 {
    public static int translateNum(int num) {
        if (num < 10) {
            //个位数,只可能有一种翻译法
            return 1;
        }
        char[] nums = String.valueOf(num).toCharArray();
        //dp[i]代表前i-1个数总共有多少种翻译方法
        int[] dp = new int[nums.length];
        dp[0] = 1;
        int n = (nums[0] - '0') * 10 + (nums[1] - '0');
        //计算初始值,第二位数和第一位数组成的数字介于(9,26)之间,有两种翻译
        //若组成的数是0~9或大于25则只能有一种翻译
        dp[1] = n > 9 && n < 26 ? 2 : 1;

        for (int i = 2; i < nums.length; i++) {
            //计算当前数和前一个数组成的数值大小,如1225的下标3的数和它前一个数组成的值为25
            n = (nums[i - 1] - '0') * 10 + (nums[i] - '0');
            if (n > 9 && n < 26) {
                //组成数值处于(9,26)范围内,则可翻译的方法数为前两个数的翻译总和
                dp[i] = dp[i - 1] + dp[i - 2];
            } else {
                //组成数值不在(9,26)范围内，则只能算一种翻译,和前一个数能翻译的方法数一样
                dp[i] = dp[i - 1];
            }
        }
        return dp[nums.length - 1];
    }

    public static void main(String[] args) {
        System.out.println(translateNum(25));

        // 一共有两种翻译。
        // 2 5
        // 25
    }
}
