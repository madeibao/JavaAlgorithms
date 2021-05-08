package com.algorithm.www;

/**
 * @ClassName HuiWenNumber2
 * @Author：Mayuan
 * @Date 2021/5/5/0005 21:47
 * @Description TODO
 * @Version 1.0
 *
 * 判断是否为回文数字2
 * https://leetcode-cn.com/problems/palindrome-number/solution/chao-xiang-xi-tu-jie-san-chong-jie-fa-9-hui-wen-sh/
 **/
public class HuiWenNumber2 {
    public static boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 &&x!=0)) {
            return false;
        }
        int ans = 0;
        while(x>ans) {
            ans = ans*10 + x%10;
            x /= 10;
        }
        return x==ans || x==(ans/10);
    }

    public static boolean isPalindrome2(int x) {
        if(x<0) {
            return false;
        }
        int ans = 0;
        int old = x;
        while(x>0) {
            ans = ans*10 + x%10;
            x /= 10;
        }
        return ans==old;
    }

    private static boolean helper(int x) {
        if(x<0) {
            return false;
        }
        int ans = 0;
        int old = x;
        while (x>0) {
            ans = ans*10+x%10;
            x = x/10;
        }
        return ans == old;
    }

    public static boolean isPalindrome3(int x) {
        if(x<0) {
            return false;
        }
        String oldStr = ""+x;
        String newStr = new StringBuilder(""+x).reverse().toString();
        return oldStr.equals(newStr);
    }

    public static void main(String[] args) {
        int x = 10;
        int x2 = 8;

        System.out.println(isPalindrome(x));
        System.out.println(isPalindrome(x2));
        System.out.println(helper(11));
    }
}
