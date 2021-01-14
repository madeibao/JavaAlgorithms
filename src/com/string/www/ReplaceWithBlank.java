package com.string.www;

/**
 * @ClassName ReplaceWithBlank
 * @Author：Mayuan
 * @Date 2020/2/18 22:16
 * @Description TODO
 * @Version 1.0
 * <p>
 * 用空格来替换字符串中的内容。
 **/
public class ReplaceWithBlank {

    public static String replaceSpace(StringBuffer str) {
        if (str == null) {
            return null;
        }
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == ' ') {
                str.replace(i, i + 1, "%20");
            }
        }
        return str.toString();
    }

    public static String replaceSpace(String s) {
        StringBuilder res = new StringBuilder();
        for (Character c : s.toCharArray()) {
            if (c == ' ') {
                res.append("%20");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static String replaceSpace2(String s) {
        //如果s全是空格的话所需的数组大小会是s的3倍，这是极端情况
        char[] reChar = new char[s.length() * 3];
        int size = 0;
        for (char c : s.toCharArray()) {
            if (c == ' ') {
                reChar[size++] = '%';
                reChar[size++] = '2';
                reChar[size++] = '0';
            } else {
                reChar[size++] = c;
            }
        }
        //可能数组空间申请过大，裁剪所需的长度转为字符串后再返回
        return new String(reChar, 0, size);
    }

    public static void main(String[] args) {

        String str = "We Are Happy";
        StringBuffer sb = new StringBuffer(str);
        System.out.println(replaceSpace(sb));
    }
}


