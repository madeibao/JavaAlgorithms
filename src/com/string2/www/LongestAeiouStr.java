package com.string2.www;

/**
 * @ClassName LongestAeiouStr
 * @Author：Mayuan
 * @Date 2025/9/21/星期日 10:28
 * @Version 1.0
 **/
public class LongestAeiouStr {
    private int longestBeautifulSubstring(String word) {
        char[] chs = word.toCharArray();
        int i = 0;
        int start;
        int len = chs.length;
        int ans = 0;
        int cnt = 1;
        while (i < len) {
            if (chs[i] == 'a') {
                start = i;
                i++;
                while (i < len && chs[i] >= chs[i - 1]) {
                    if (chs[i] > chs[i - 1]) {
                        cnt += 1;
                    }
                    i++;
                }
                if (cnt == 5) {
                    ans = Math.max(ans, i - start);
                }
                cnt = 1;
            } else {
                i++;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String str = "aaeioua";
        System.out.println(new LongestAeiouStr().longestBeautifulSubstring(str));
    }
}
