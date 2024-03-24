package com.string.www;

/**
 * @program: JavaWorkSpace2->ConstructDuplicateString
 * @description: 组成重复的字符内容
 * @author: MaYuan
 * @create: 2020-02-11 21:10
 * @version: 1.0
 * <p>
 * 给定一个非空的字符串，判断它是否可以由它的一个子串重复多次构成。给定的字符串只含有小写英文字母，并且长度不超过10000。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "abab"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "ab" 重复两次构成。
 * <p>
 * 输入: "abcabcabcabc"
 * <p>
 * 输出: True
 * <p>
 * 解释: 可由子字符串 "abc" 重复四次构成。 (或者子字符串 "abcabc" 重复两次构成。)
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/repeated-substring-pattern
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ConstructDuplicateString {

    public static boolean repeatedSubstringPattern(String s) {
        return (s + s).indexOf(s, 1) != s.length();
    }

    // f(x+T) = F(x)
    public boolean repeatedSubstringPattern2(String s) {
        /** i代表周期 */
        for (int i = 2; i <= s.length() / 2; i++) {
            if (s.length() % i != 0) {
                continue;
            }
            /** j代表下标 从 0 + i开始 而不是从 1 + i 开始 */
            for (int j = i; j < s.length(); j++) {
                if (s.charAt(j % i) != s.charAt(j)) {
                    break;
                }
                if (j == s.length() - 1)
                    return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "abab";
        String s2 = "aa";
        System.out.println(repeatedSubstringPattern(s));
        System.out.println(repeatedSubstringPattern(s2));
    }
}
