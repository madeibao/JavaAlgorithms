package com.string.www;

/**
 * @ClassName CompressString
 * @Author：Mayuan
 * @Date 2020/3/18 10:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的压缩
 * 字符串压缩。利用字符重复出现的次数，编写一种方法，实现基本的字符串压缩功能。比如，字符串aabcccccaaa会变为a2b1c5a3。若“压缩”后的字符串没有变短，则返回原先的字符串。你可以假设字符串中只包含大小写英文字母（a至z）。
 * <p>
 * 示例1:
 * <p>
 * 输入："aabcccccaaa"
 * 输出："a2b1c5a3"
 * 示例2:
 * <p>
 * 输入："abbccd"
 * 输出："abbccd"
 * 解释："abbccd"压缩后为"a1b2c2d1"，比原字符串长度更长。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/compress-string-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class CompressString {

    public static String compressString(String S) {
        if (S == null || S.length() <= 2) {
            return S;
        }
        StringBuilder sb = new StringBuilder().append(S.charAt(0));
        int cnt = 1;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == S.charAt(i - 1)) {
                cnt++;
            } else {
                sb.append(cnt).append(S.charAt(i));
                // 重置cnt=1;
                cnt = 1;
            }
        }

        return sb.append(cnt).length() < S.length() ? sb.toString() : S;
    }

    public static void main(String[] args) {
        String s = "aabcccccaaa";
        String s2 = compressString(s);
        System.out.println(s2);
    }
}
