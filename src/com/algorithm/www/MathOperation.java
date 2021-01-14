package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->MathOperation
 * @description: 数学操作内容
 * @author: MaYuan
 * @create: 2020-01-01 21:15
 * @version: 1.0
 **/
public class MathOperation {
    public static void main(String[] args) {

        // 向上面取最大值。 天花板。
        double num = Math.ceil(15.6);
        //16.0
        System.out.println(num);

        // 向下面取最大值，地板，floor
        double num2 = Math.floor(15.3);
        // 15.0
        System.out.println(num2);
    }
}
