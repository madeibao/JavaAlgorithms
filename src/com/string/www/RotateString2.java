package com.string.www;

/**
 * @ClassName RotateString2
 * @Author：Mayuan
 * @Date 2020/5/23 16:25
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的旋转操作2
 * 判断两个字符串是否能够通过旋转来得到。
 * <p>
 * 字符串轮转。给定两个字符串s1和s2，请编写代码检查s2是否为s1旋转而成（比如，waterbottle是erbottlewat旋转后的字符串）。
 * <p>
 * 示例1:
 * <p>
 * 输入：s1 = "waterbottle", s2 = "erbottlewat"
 * 输出：True
 * 示例2:
 * <p>
 * 输入：s1 = "aa", "aba"
 * 输出：False
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/string-rotation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class RotateString2 {
    public static boolean isFlipedString(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        s1 += s1;
        int i = 0;
        int j = 0;
        while (i != s1.length() && j != s2.length()) {
            if (s1.charAt(i) == s2.charAt(j)) {
                i++;
                j++;
            } else {
                j = 0;
                i++;
            }
        }
        return j == s2.length();
    }

    public static boolean isFlipedString2(String s1, String s2) {
        return s1.length() == s2.length() && ((s1 + s1).indexOf(s2) != -1);
    }

    public static void main(String[] args) {
        String s1 = "waterbottle", s2 = "erbottlewat";
        System.out.println(isFlipedString2(s1, s2));
    }
}


