package com.string.www;

/**
 * @ClassName StringDistance
 * @Author：Mayuan
 * @Date 2020/4/5 16:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的距离的更新表示
 **/
public class StringDistance {

    public static int GetMinDistance(String S1, String S2) {
        if (S1 == null || S2 == null || S1.length() != S2.length()) throw new IllegalArgumentException();
        char[] s1 = S1.toCharArray(), s2 = S2.toCharArray();
        int ans = Integer.MAX_VALUE;
        for (char x1 = 'a'; x1 <= 'z'; ++x1) {
            for (char x2 = 'a'; x2 <= 'z'; ++x2) {
                int tmp = 0;
                for (int i = 0; i < s1.length; ++i) {
                    if (s1[i] == x1) {
                        s1[i] = x2;
                        //替换

                        if (s1[i] != s2[i]) {
                            ++tmp;
                            //计算距离
                        }
                        s1[i] = x1;
                        //恢复
                    } else {
                        if (s1[i] != s2[i]) {
                            ++tmp;
                            //计算距离
                        }
                    }
                }
                ans = Math.min(ans, tmp);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String s1 = "aaa";
        String s2 = "bbb";
        System.out.println(GetMinDistance(s1, s2));
    }
}
