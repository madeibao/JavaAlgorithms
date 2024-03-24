package com.string.www;

/**
 * @ClassName HuiWenString2
 * @Author：Mayuan
 * @Date 2020/3/17 10:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断字符串是否为回文字符串。
 **/
public class HuiWenString2 {

    static boolean isHuiWen(String s) {

        int length = s.length();
        for (int i = 0; i < length / 2; i++) {
            if (s.toCharArray()[i] != s.toCharArray()[length - i - 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isHuiWen2(String s) {
        StringBuilder sb = new StringBuilder(s);
        if (sb.reverse().toString().equals(s)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isHuiWen2("abccba"));
    }
}
