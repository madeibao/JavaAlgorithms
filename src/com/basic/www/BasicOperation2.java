package com.basic.www;

/**
 * @ClassName BasicOperation2
 * @Author：Mayuan
 * @Date 2020/6/7 16:21
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的运算结果值。
 **/
public class BasicOperation2 {
    public static void main(String[] args) {
        int y = 5;
        y /= --y - 5;
        // 解释如下：
        // 首先是y自减1得到 4， 然后4 -5 = -1
        // y = 5 /(-1) = -5
        System.out.println(y);
    }
}
