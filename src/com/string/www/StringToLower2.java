package com.string.www;

/**
 * @program: JavaWorkSpace2->StringToLower2
 * @description: 字符串变成小写的内容
 * @author: MaYuan
 * @create: 2020-01-27 11:34
 * @version: 1.0
 **/
public class StringToLower2 {
    private static String toLower2(String str) {
        if (str == null || "".equals(str)) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "Hello World";
        System.out.println(toLower2(str));
    }
}
