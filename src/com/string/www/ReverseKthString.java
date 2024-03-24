package com.string.www;

/**
 * @ClassName ReverseKthString
 * @Author：Mayuan
 * @Date 2020/5/26 20:44
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的结果来进行翻转
 * 字符串的每2k个字符来进行翻转其中的k个字符。
 * <p>
 * 给定一个字符串 s 和一个整数 k，你需要对从字符串开头算起的每隔 2k 个字符的前 k 个字符进行反转。
 * <p>
 * 如果剩余字符少于 k 个，则将剩余字符全部反转。
 * 如果剩余字符小于 2k 但大于或等于 k 个，则反转前 k 个字符，其余字符保持原样。
 * 示例:
 * <p>
 * 输入: s = "abcdefg", k = 2
 * 输出: "bacdfeg"
 * <p>
 * 单单的翻转前k个字符的结果值。
 **/
public class ReverseKthString {
    public static String reverseStr(String s, int k) {
        char[] arr = s.toCharArray();
        for (int left = 0, step = 2 * k; left < arr.length; left += step) {
            int right = Math.min(arr.length - 1, left + k - 1);
            swap(arr, left, right);
        }
        return new String(arr);
    }

    private static void swap(char[] arr, int left, int right) {
        while (left < right) {
            arr[left] ^= arr[right];
            arr[right] ^= arr[left];
            arr[left++] ^= arr[right--];
        }
    }

    public static void main(String[] args) {
        String s = "abcdefg";
        int k = 2;
        System.out.println(reverseStr(s, k));
    }
}
