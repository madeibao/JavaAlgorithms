package com.string.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PermutationNumbers
 * @Author：Mayuan
 * @Date 2021/1/15/0015 19:59
 * @Description TODO
 * @Version 1.0
 *
 * 字符串的排列组合的数量。
 *
 * //字符串的排列组合，然后确定最终的数量大小，
 * 字符串中可能包含有重复的字符。
 *
 * aab
 *
 * 第一题思路：
 * map存每个字符出现数量。
 * 然后字符数量的阶乘除以每个字符数量的阶乘
 * 比如 aabbbcccc
 * 答案：9!/2!/3!/4!
 **/
public class PermutationNumbers {

    private static int getNum(char[] ch) {
        Map<Character,Integer> map=new HashMap<Character,Integer>(8);
        for(int i=0;i<ch.length;i++) {
            if(map.containsKey(ch[i])) {
                int value=map.get(ch[i]);
                map.put(ch[i], value+1);
            }
            else {
                map.put(ch[i], 1);
            }
        }


        int len=ch.length;
        int res=1;
        while(len!=1){
            res=res*len;
            len--;
        }

        for(Character c:map.keySet()) {
            int value=map.get(c);
            while(value!=1) {
                res=res/value;
                value--;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        String str ="aab";
        char[] ch = str.toCharArray();
        System.out.println(getNum(ch));

    }
}
