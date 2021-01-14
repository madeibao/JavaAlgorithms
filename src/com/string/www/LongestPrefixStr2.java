package com.string.www;

/**
 * @ClassName LongestPrefixStr2
 * @Author：Mayuan
 * @Date 2020/12/8/0008 18:38
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共前缀2
 **/
public class LongestPrefixStr2 {


    private static String longestCommonPrefix3(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // 逐渐的像后面迭代。
        // 两个两个相互的比较，一直到最后的一个就是结果。
        for (int i = 0; i < strs.length - 1; i++) {
            strs[i + 1] = longestPre(strs[i], strs[i + 1]);
        }
        return strs[strs.length - 1];
    }

    /**
     * 求公共的最长的子序列的值。
     *
     * @param str1
     * @param str2
     * @return
     */
    private static String longestPre(String str1, String str2) {
        int index = 0;
        int len = Math.min(str1.length(), str2.length());
        while (index < len) {
            if (str1.charAt(index) != str2.charAt(index)) {
                break;
            }
            index++;
        }
        return str1.substring(0, index);
    }

    public static void main(String[] args) {

        String[] str = {"fly", "flower", "flyer"};
        System.out.println(longestCommonPrefix3(str));
    }
}
