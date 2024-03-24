package com.string.www;

/**
 * @ClassName CompressString2
 * @Author：Mayuan
 * @Date 2020/4/14 21:28
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的压缩，第二种方法
 **/
public class CompressString2 {
    public static String compressString(String S) {

        StringBuilder sb = new StringBuilder(S);
        sb.append('#');
        StringBuilder res = new StringBuilder();
        int count = 1;
        for (int i = 0; i < sb.length() - 1; i++) {
            if (sb.charAt(i) == sb.charAt(i + 1)) {
                count++;
            } else {
                if (count > 1) {
                    res.append(count - 1);
                }
                res.append(sb.charAt(i));
                count = 1;
            }
        }
        return res.toString();

    }

    public static void main(String[] args) {

        String s = "xxxxyyyyyyzbbb";
        System.out.println(compressString(s));

    }
}
