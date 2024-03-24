package com.string.www;

/**
 * @ClassName ReverseVowel
 * @Author：Mayuan
 * @Date 2020/12/8/0008 20:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 翻转字符串中的元音字母
 **/
public class ReverseVowel {
    public static String reverseVowels(String s) {
        int i = 0;
        int j = s.length() - 1;
        char[] ch = s.toCharArray();


        while (i < j) {
            if (j < i) {
                break;
            }

            while (i < j && !isVovel(ch[i])) {
                i++;
            }
            while (i < j && !isVovel(ch[j])) {
                j--;
            }
            swop(ch, i, j);
            i++;
            j--;
        }
        return String.valueOf(ch);
    }

    private static boolean isVovel(char c) {
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'U' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        return false;
    }

    private static void swop(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String str = "leetcode";
        System.out.println(reverseVowels(str));
    }
}
