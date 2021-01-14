package com.basic.www;

/**
 * @program: JavaWorkSpace2->BasicFunctionRule
 * @description: 基本的方法规则
 * @author: MaYuan
 * @create: 2019-12-25 21:59
 * @version: 1.0
 **/
public class BasicFunctionRule {
    private static int changeNum(int a) {
        a = 10;
        return a;
    }

    public static void main(String[] args) {
        int b = 5;
        changeNum(b);
        //由于传入的是形参，并且是基本的类型，所以不会改变，仍然输出5.
        System.out.println(b);
        int c = 5;
        c = changeNum(c);
        //这种情况下输出的是10.
        System.out.println(c);
    }
}



