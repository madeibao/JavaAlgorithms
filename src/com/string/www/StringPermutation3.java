package com.string.www;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName StringPermutation3
 * @Author：Mayuan
 * @Date 2020/3/17 18:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 有重复元素的全排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * <p>
 * 示例:
 * <p>
 * 输入：s = "abc"
 * 输出：["abc","acb","bac","bca","cab","cba"]
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class StringPermutation3 {
    Set<String> set = new HashSet<>();

    public String[] permutation(String s) {
        char[] ch = s.toCharArray();
        boolean[] flag = new boolean[s.length()];
        dfs(ch, "", 0, flag);
        return set.toArray(new String[set.size()]);
    }

    public void dfs(char[] ch, String str, int count, boolean[] flag) {
        if (count == ch.length) {
            set.add(str);
            return;
        }
        for (int i = 0; i < ch.length; i++) {
            if (!flag[i]) {
                flag[i] = !flag[i];
                dfs(ch, str + ch[i], count + 1, flag);
                flag[i] = !flag[i];
            }
        }
    }

    public static void main(String[] args) {
        String s = "abc";
        String[] s2 = new StringPermutation3().permutation(s);
        for (String c : s2) {
            System.out.print(c + " ");
        }
    }
}
