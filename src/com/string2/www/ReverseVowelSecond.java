package com.string2.www;

/**
 * 逆转字符串原因字符
 *
 * @ClassName ReverseVowelSecond
 * @Author：Mayuan
 * @Date 2024/11/9/星期六 18:50
 * @Description TODO
 * @Version 1.0
 **/
public class ReverseVowelSecond {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        char[] ch = s.toCharArray();

        while (i < j) {
            while (i < j && !isVowels(s.charAt(i))) {
                i++;
            }
            while (i < j && !isVowels(s.charAt(j))) {
                j--;
            }
            swap(ch, i, j);
            i++;
            j--;
        }
        return new String(ch);
    }

    public boolean isVowels(char c) {
//        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';4
        String str ="aeiouAEIOU";
//        return str.contains(String.valueOf(c));
        return str.indexOf(c) >= 0;
    }
    public void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        String s = "IceCreAm";
        ReverseVowelSecond rv = new ReverseVowelSecond();
        System.out.println(rv.reverseVowels(s));
    }

}
