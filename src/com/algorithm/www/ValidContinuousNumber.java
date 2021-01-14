package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->ValidContinuousNumber
 * @description: 合法的连续的出现的0和1个数
 * @author: MaYuan
 * @create: 2020-01-15 20:47
 * @version: 1.0
 * 示例 1 :
 * <p>
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 * <p>
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 * <p>
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 * 示例 2 :
 * <p>
 * 输入: "10101"
 * 输出: 4
 * 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
 **/
public class ValidContinuousNumber {
    public static int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        int count = 1, pre = 0;
        int res = 0;
        for (int i = 1; i < chars.length; i++) {
            if (chars[i - 1] == chars[i]) {
                count++;
            } else {
                res += Math.min(pre, count);
                pre = count;
                count = 1;
            }
        }
        res += Math.min(pre, count);
        return res;
    }

    public static void main(String[] args) {
        String str = "10101";
        System.out.println(countBinarySubstrings(str));
    }
}
