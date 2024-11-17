package com.string2.www;

/**
 * @ClassName MinSortStr
 * @Author：Mayuan
 * @Date 2024/11/16/星期六 18:09
 * @Description TODO
 * @Version 1.0
 **/
public class MinSortStr {
    public String getSmallestString(String s) {

        char[] chs = s.toCharArray();
        for (int i = 0; i < chs.length - 1; i++) {
            if (isSame(chs[i], chs[i+1]) && chs[i] > chs[i + 1]) {
                extracted(chs, i, i + 1);
                break;
            }
        }
        return String.valueOf(chs);
    }

    private static void extracted(char[] chs, int i, int i1) {
        char temp = chs[i];
        chs[i] = chs[i1];
        chs[i1] = temp;
    }

    public boolean isSame(char m, char n) {
        return (m - '0') % 2 == (n - '0') % 2;
    }

    public static void main(String[] args) {


    }
}
