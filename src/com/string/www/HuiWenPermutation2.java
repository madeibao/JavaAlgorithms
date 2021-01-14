package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName HuiWenPermutation2
 * @Author：Mayuan
 * @Date 2020/3/17 10:24
 * @Description TODO
 * @Version 1.0
 * <p>
 * 回文字符串的排列情况
 * 给定一个字符串，编写一个函数判定其是否为某个回文串的排列之一。
 * <p>
 * 回文串是指正反两个方向都一样的单词或短语。排列是指字母的重新排列。
 * <p>
 * 回文串不一定是字典当中的单词。
 * <p>
 * 示例1：
 * <p>
 * 输入："tactcoa"
 * 输出：true（排列有"tacocat"、"atcocta"，等等）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/palindrome-permutation-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class HuiWenPermutation2 {

    public static boolean canPermutePalindrome(String s) {

        Set<Character> set2 = new HashSet<>();
        for (char c : s.toCharArray()) {

            if (!set2.add(c)) {
                set2.remove(c);
            }
        }
        return set2.size() <= 1;
    }

    public static void main(String[] args) {
        System.out.println(canPermutePalindrome("tactcoa"));
    }
}




