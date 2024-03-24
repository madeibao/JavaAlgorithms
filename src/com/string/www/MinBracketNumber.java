package com.string.www;

/**
 * @ClassName MinBracketNumber
 * @Author：Mayuan
 * @Date 2020/2/20 14:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最小的括号的数量内容。
 * <p>
 * 一个完整的括号字符串定义规则如下:
 * 1、空字符串是完整的。
 * 2、如果s是完整的字符串，那么(s)也是完整的。
 * 3、如果s和t是完整的字符串，将它们连接起来形成的st也是完整的。
 * 例如，"(()())", ""和"(())()"是完整的括号字符串，"())(", "()(" 和 ")"是不完整的括号字符串。
 * 牛牛有一个括号字符串s,现在需要在其中任意位置尽量少地添加括号,将其转化为一个完整的括号字符串。请问牛牛至少需要添加多少个括号。
 * 输入描述:
 * 输入包括一行,一个括号序列s,序列长度length(1 ≤ length ≤ 50).
 * s中每个字符都是左括号或者右括号,即'('或者')'.
 * 输出描述:
 * 输出一个整数,表示最少需要添加的括号数
 * 示例1
 * 输入
 * 复制
 * (()(()
 * 输出
 * 复制
 * 2
 **/

import java.util.*;

public class MinBracketNumber {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.println(helper(in.nextLine()));
        }
    }

    public static int helper(String s) {
        char[] cs = s.toCharArray();
        int countL = 0, countR = 0, i = 0;
        while (i < cs.length) {
            if (cs[i] == '(') {
                countL++;
            } else {
                // 遇到右括号时，若前面有左括号未匹配，则匹配消除   如果没有，则右括号数目加1
                if (countL != 0) {
                    countL--;
                } else {
                    countR++;
                }
            }
            i++;
        }
        return countL + countR;
    }
}



