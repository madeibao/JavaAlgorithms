package com.algorithm.www;

import java.util.Arrays;

/**
 * @ClassName MaxNumber
 * @Author：Mayuan
 * @Date 2020/5/9 21:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 调整数字来达到最大的结果值。
 * <p>
 * 给定一组非负整数，重新排列它们的顺序使之组成一个最大的整数。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [10,2]
 * 输出: 210
 * 示例 2:
 * <p>
 * 输入: [3,30,34,5,9]
 * 输出: 9534330
 **/
public class MaxNumber {
    public static String largestNumber(int[] nums) {
        //合法性
        if (nums == null || nums.length == 0) {
            return "";
        }
        //数字数组->字符数组转化
        String[] strArr = new String[nums.length];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = String.valueOf(nums[i]);
        }
        //重写排序规则 12-14ms
        // Arrays.sort(strArr, new Comparator<String>() {
        //     @Override
        //     public int compare(String o1, String o2) {
        //         //继承此方法的时候，要自定义比较器，conpareTo方法返回值为1(升序),0，-1(降序)。
        //         //返回正值 交换；负值不交换
        //         return (o2 + o1).compareTo((o1 + o2));
        //     }
        // });
        //  Lambda表达式 重写排序规则 速度慢了5倍 72-82ms

        Arrays.sort(strArr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));
        //字符数组->字符串 转化
        StringBuilder sb = new StringBuilder();
        for (String aStrArr : strArr) {
            sb.append(aStrArr);
        }
        String result = sb.toString();
        //特殊情况 若干个零

        // 如果是第一个为字母为0，则返0
        if (result.charAt(0) == '0') {
            result = "0";
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {10, 2};
        System.out.println(largestNumber(nums));
    }
}
