package com.string.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName GenerateBracket2
 * @Author：Mayuan
 * @Date 2020/12/13/0013 10:18
 * @Description TODO
 * @Version 1.0
 * <p>
 * 生成括号的值。
 * 生成括号
 * 递归的写法。
 **/
public class GenerateBracket2 {

    public static List<String> generate(int n) {
        ArrayList<String> res =new ArrayList<>();
        if(n<=0) {
            return res;
        }
        helper("",res,n,n);
        return res;
    }

    private static void helper(String res, ArrayList<String> list2, int left, int right) {
        if(left<0||right<0||left>right) {
            return;
        }
        if(left==0&&right==0) {
            list2.add(res);
        }

        helper(res+"(",list2, left-1, right);
        helper(res+")",list2, left, right-1);

    }
    public static void main(String[] args) {
        int n = 3;
        List<String> res = generate(n);
        for (String re : res) {
            System.out.println(re);
        }
    }
}



