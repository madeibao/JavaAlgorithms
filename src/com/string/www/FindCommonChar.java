package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FindCommonChar
 * @Author：Mayuan
 * @Date 2024/3/10/0010 21:00
 * @Description TODO
 * @Version 1.0
 **/
public class FindCommonChar {
    public static List<String> commonChars(String[] words) {
        List<String> res = new ArrayList<>();
        int[] cnt = new int[26];

        for(int i=0;i<words[0].length();i++) {
            cnt[words[0].charAt(i)-'a']++;
        }
        for(int i=1;i<words.length;i++) {
            String temp = words[i];
            int[] tempCnt = new int[26];
            for(int j=0;j<temp.length();j++) {
                tempCnt[temp.charAt(j)-'a']++;
            }

            for(int m=0;m<26;m++) {
                cnt[m] = Math.min(cnt[m],tempCnt[m]);
            }
        }

        for(int i=0;i<cnt.length;i++) {
            while (cnt[i]-->0) {
                res.add(String.valueOf((char)(i+'a')));
            }
        }

        return res;
    }


    public static void main(String[] args) {
        String[] strs = {"bella","label","roller"};
        System.out.println(commonChars(strs));
    }
}
