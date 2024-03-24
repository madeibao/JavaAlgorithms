package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName StringPattern
 * @Author：Mayuan
 * @Date 2021/3/28/0028 11:08
 * @Description TODO
 * @Version 1.0
 *
 * 字符串的匹配操作。
 **/
public class StringPattern {

    /**
     * @param s1
     * @param s2
     * @return
     *
     * 第一个字符串是没有匹配
     * 第二个是字符串的模式。
     */
    boolean check(String s1 , String s2) {
        int index = 0;
        for(int i = 0; i < s1.length(); i ++) {
            if(index<s2.length() && s1.charAt(i) == s2.charAt(index)){
                index ++;
            }

            // 中间不能出现大写字母。
            else if(s1.charAt(i)>='A' && s1.charAt(i)<='Z') {
                return false;
            }
        }

        return index == s2.length();
    }
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(String s : queries){
            boolean t = check(s , pattern);
            ans.add(t);
        }
        return ans;
    }
    public static void main(String[] args) {
        String[] queries = {"FooBar","FooBarTest","FootBall","FrameBuffer","ForceFeedBack"};
        String pattern = "FB";
        System.out.println(new StringPattern().camelMatch(queries,pattern));

    }
}
