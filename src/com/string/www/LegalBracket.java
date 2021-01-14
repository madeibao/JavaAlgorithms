package com.string.www;

import java.util.Stack;

/**
 * @ClassName LegalBracket
 * @Author：Mayuan
 * @Date 2020/5/20 22:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * 合法的字符串匹配
 * <p>
 * * 可以被视为左括号或者是右括号，
 * 求是否为合法的匹配。
 * <p>
 * 给定一个只包含三种字符的字符串：（ ，） 和 *，写一个函数来检验这个字符串是否为有效字符串。有效字符串具有如下规则：
 * <p>
 * 任何左括号 ( 必须有相应的右括号 )。
 * 任何右括号 ) 必须有相应的左括号 ( 。
 * 左括号 ( 必须在对应的右括号之前 )。
 * * 可以被视为单个右括号 ) ，或单个左括号 ( ，或一个空字符串。
 * 一个空字符串也被视为有效字符串。
 * 示例 1:
 * <p>
 * 输入: "()"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "(*)"
 * 输出: True
 * 示例 3:
 * <p>
 * 输入: "(*))"
 * 输出: True
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/valid-parenthesis-string
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class LegalBracket {

    public static boolean checkValidString(String s) {
        // index stack
        Stack<Integer> left = new Stack<>(), star = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                left.push(i);
            } else if (c == '*') {
                star.push(i);
            } else {
                if (!left.isEmpty()) {
                    left.pop();
                } else if (!star.isEmpty()) {
                    star.pop();
                } else {
                    return false;
                }
            }
        }

        while (!left.isEmpty() && !star.isEmpty()) {
            if (left.pop() > star.pop()) {
                return false;
            }
        }
        return left.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()*)";
        System.out.println(checkValidString(str));
    }
}
