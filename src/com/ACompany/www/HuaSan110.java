package com.ACompany.www;

/**
 * @ClassName HuaSan110
 * @Author：Mayuan
 * @Date 2020/11/9 8:59
 * @Description TODO
 * @Version 1.0
 **/
public class HuaSan110 {
    /**
     * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
     *
     * @param str string字符串
     * @return string字符串
     */
    public static String character_auto_complete(String str) {
        // write code here
        String today = "Monday Tuesday Wednesday Thursday Friday Saturday Sunday";
        String[] strs = today.split(" ");

        String temp = "";
        for (String s : strs) {
            if (s.startsWith(str)) {
                temp = temp + s + " ";
            }
        }
        if (temp == null) {
            return "No match";
        } else {
            return temp.trim();
        }
    }

    public static void main(String[] args) {
        String str = "S";
        System.out.println(character_auto_complete(str));
    }
}
