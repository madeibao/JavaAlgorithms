package com.string.www;

/**
 * @ClassName ReverseString2
 * @Author：Mayuan
 * @Date 2020/11/2 16:41
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的翻转
 **/
public class ReverseString2 {

    public static String reverseString(String iniString) {
        // write code here
        /*char[] ch = iniString.toCharArray();
        int len = iniString.length();
        for(int i=0; i<len; i++){
            char temp = ch[i];
            ch[i] = ch[len-1-i];
            ch[len-1-i] = temp;
        }
        return new String(ch);*/

        char[] a = iniString.toCharArray();
        for (int i = 0; i < a.length / 2; i++) {
            char temp = a[a.length - 1 - i];
            a[a.length - i - 1] = a[i];
            a[i] = temp;
        }
        return new String(a);
    }

    public static void main(String[] args) {
        String str2 = "This is nowcoder";
        System.out.println(reverseString(str2));
    }
}
