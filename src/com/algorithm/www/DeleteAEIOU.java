package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->DeleteAEIOU
 * @description: 删去字符串中的元音字母
 * @author: MaYuan
 * @create: 2020-02-09 16:41
 * @version: 1.0
 * 删去字符串中的元音的字母内容。
 **/
public class DeleteAEIOU {

    private static String removeChar(String s) {
        StringBuilder sb = new StringBuilder();
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] != 'a' && ch[i] != 'e' && ch[i] != 'i' && ch[i] != 'o' && ch[i] != 'u') {
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "leetcodeisacommunityforcoders";
        System.out.println(removeChar(s));
    }
}
