package com.string2.www;

/**
 * @ClassName SplitWord
 * @Author：Mayuan
 * @Date 2021/3/30/0030 20:41
 * @Description TODO
 * @Version 1.0
 * 单词的拆分操作。
 **/
public class SplitWord{
    public int countSegments(String s) {
        int ans = 0;
        String[] arr = s.split(" ");
        for (String a : arr) {
            if (!a.equals("")) {
                ans++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String str = "I am the king of the world";
        SplitWord ss = new SplitWord();

        System.out.println(ss.countSegments(str));

    }
}
