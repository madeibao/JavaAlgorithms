package com.string.www;

/**
 * @ClassName LongestPrefixStr
 * @Author：Mayuan
 * @Date 2020/12/7/0007 19:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共前缀
 **/
public class LongestPrefixStr {

    public String longestCommonPrefix3(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        String result = strs[0];
        for (int i = 0; i < strs.length; i++) {
            while (strs[i].indexOf(result) != 0) {
                result = result.substring(0, result.length() - 1);
                if (result.length() == 0) {
                    return "";
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String[] str = {"fly", "flower", "flyer"};
        System.out.println(new LongestPrefixStr().longestCommonPrefix3(str));
    }
}
