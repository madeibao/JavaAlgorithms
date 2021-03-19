package com.string2.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateBracket
 * @Author：Mayuan
 * @Date 2021/3/18/0018 22:26
 * @Description TODO
 * @Version 1.0
 *
 * 产生括号。
 * 括号的生成算法。
 **/
public class GenerateBracket {

    private static List<String> generate(int n) {
        ArrayList<String> res = new ArrayList<>();
        if(n<=0) {
            return res;
        }
        helper("",res, n,n);
        return res;
    }

    private static void helper(String res, List<String> list2, int left ,int right) {

        if(left<0||right<0||left>right) {
            return;
        }

        if(left==0&&right==0) {
            list2.add(res);
        }
        helper(res+"(",list2,left-1,right);
        helper(res+")",list2,left,right-1);
    }
    public static void main(String[] args) {
        int n = 3;
        List<String> res = generate(n);
        for (String re : res) {
            System.out.println(re);
        }
    }
}
