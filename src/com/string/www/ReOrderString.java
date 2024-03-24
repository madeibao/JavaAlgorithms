package com.string.www;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName ReOrderString
 * @Author：Mayuan
 * @Date 2023/10/18/0018 11:34
 * @Description TODO
 * @Version 1.0
 *
 * leetcode 791
 *
 **/
public class ReOrderString {

    public String customSortString(String order, String s) {
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        StringBuilder sb= new StringBuilder();
        for(int i=0;i<order.length();i++) {
            char temp = order.charAt(i);
            if(map.containsKey(temp)) {
                for(int j=0;j<map.get(temp);j++) {
                    sb.append(temp);
                }
            }
        }

        for(int i=0;i<s.length();i++) {
            if(order.indexOf(s.charAt(i))==-1) {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        String order = "cba", s = "abcd";
        System.out.println(new ReOrderString().customSortString(order,s));
    }
}
