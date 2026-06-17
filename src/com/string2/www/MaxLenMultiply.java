package com.string2.www;

/**
 *
 * 最大单词乘积
 * 
 * @ClassName MaxLenMultiply
 * @Author Mayuan
 * @Date 2026/6/17/星期三 12:03
 * @Version 1.0
 **/
public class MaxLenMultiply {

    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= (1 << (c - 'a'));
            }
            masks[i] = mask;
        }

        int maxRes = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    maxRes = Math.max(maxRes, (words[i].length() * words[j].length()));
                }
            }
        }
        return maxRes;
    }
    
    public static void main(String[] args) {
        
        

    }
}
