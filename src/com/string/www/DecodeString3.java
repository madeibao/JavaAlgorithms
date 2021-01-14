package com.string.www;

import java.util.LinkedList;

/**
 * @ClassName DecodeString3
 * @Author：Mayuan
 * @Date 2020/6/7 16:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的解码，形式3
 **/
public class DecodeString3 {
    public static String decodeString(String s) {
        StringBuilder res = new StringBuilder();
        int multi = 0;

        // 构造的是一个双向链表。
        LinkedList<Integer> stack_multi = new LinkedList<>();
        LinkedList<String> stack_res = new LinkedList<>();

        for (Character c : s.toCharArray()) {
            if (c == '[') {
                stack_multi.addLast(multi);
                stack_res.addLast(res.toString());
                multi = 0;
                res = new StringBuilder();
            } else if (c == ']') {
                StringBuilder tmp = new StringBuilder();
                int cur_multi = stack_multi.removeLast();
                for (int i = 0; i < cur_multi; i++) {
                    tmp.append(res);
                }
                res = new StringBuilder(stack_res.removeLast() + tmp);
            } else if (c >= '0' && c <= '9') {
                // 解码其中的数字的结果值。
                multi = multi * 10 + Integer.parseInt(c + "");
            } else {
                res.append(c);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {

        String s = "3[a]2[bc]";
        System.out.println(decodeString(s));
    }

}
