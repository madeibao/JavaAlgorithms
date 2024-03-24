package com.string.www;

/**
 * @program: JavaWorkSpace2->ReverseCharArray
 * @description: 原地逆置一个字符序列
 * @author: MaYuan
 * @create: 2019-12-29 19:31
 * @version: 1.0
 * <p>
 * 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 char[] 的形式给出。
 * 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 * 你可以假设数组中的所有字符都是 ASCII 码表中的可打印字符。
 **/
public class ReverseCharArray {
    public static void reverseString(char[] s) {
        char temp = ' ';
        for (int i = 0; i < s.length / 2; i++) {
            temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }

    private static void reverseString2(char[] s) {
        int i = 0, j = s.length - 1;
        char temp;
        while (i < j) {
            temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            i++;
            j--;
        }
    }

    public static void main(String[] args) {
        char[] ch = {'h', 'e', 'l', 'l', 'o'};
        reverseString2(ch);
        System.out.println(String.valueOf(ch));
    }
}


