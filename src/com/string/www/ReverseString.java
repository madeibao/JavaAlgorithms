package com.string.www;

import java.util.*;

/**
 * @ClassName ReverseString
 * @Author：Mayuan
 * @Date 2020/5/24 19:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的翻转
 * the sky is blue
 * blue is sky the
 **/
public class ReverseString {

    private static String reverse(String str) {
        String[] strs = str.split("\\s+");
        //使用工具类Arrays.asList()将其转换为List集合
        List<String> strLists = Arrays.asList(strs);
        //使用Collections.reverse()方法反转内容
        Collections.reverse(strLists);
        //使用StringJoiner来拼接反转后的字符串即可
        str = String.join(" ", strLists);
        return str;
    }


    // 方法2的内容，用双端队列来进行实现。

    private static String reverse2(String str) {
        int left = 0;
        int right = str.length() - 1;
        //构建双端队列
        Deque<String> deque = new ArrayDeque();
        StringBuilder word = new StringBuilder();
        while (left <= right) {
            char charStr = str.charAt(left);
            if ((word.length() != 0) && (charStr == ' ')) {
                // 将单词 push 到队列的头部
                // 由于是倒序，所以添加到队列的头部。
                deque.offerFirst(word.toString());
                // 重新置零。
                word.setLength(0);
            } else if (charStr != ' ') {
                word.append(charStr);
            }
            ++left;
        }
        deque.offerFirst(word.toString());
        return String.join(" ", deque);
    }

    public static void main(String[] args) {
        System.out.println(reverse("the sky is blue"));
        System.out.println();
        System.out.println(reverse2("the sky is blue"));
    }


}
