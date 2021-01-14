package com.string.www;

/**
 * @ClassName StringIndex2
 * @Author：Mayuan
 * @Date 2020/10/22 10:42
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串中的第一个唯一出现的字符
 **/
public class StringIndex2 {

    public static int firstUniqChar(String s) {
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                temp = i;
                break;
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        String s = "loveleetcode";
        System.out.println(firstUniqChar(s));
    }
}
