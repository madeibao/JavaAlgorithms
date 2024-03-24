package com.string.www;

/**
 * @ClassName ReverseString9
 * @Author：Mayuan
 * @Date 2020/11/26/0026 10:51
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转字符串中的元音字母
 * Java语言。
 *
 **/
public class ReverseString9 {

    private static String reverse(String str2) {
        int i = 0, j = str2.length() - 1;
        char[] ch = str2.toCharArray();

        while (i < j) {

            while (i < j && !isVowel(ch[i])) {
                i++;
            }
            while (i < j && !isVowel(ch[j])) {
                j--;
            }
            if (i >= j) {
                break;
            }
            swap(ch, i, j);
            i++;
            j--;
        }
        return new String(ch);
    }

    private static boolean isVowel(char ch) {
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            return true;
        }
        return false;
    }

    private static void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {

        String str2 = "leetcode";
        System.out.println(reverse(str2));
    }
}
