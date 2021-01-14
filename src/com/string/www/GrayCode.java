package com.string.www;

import java.util.ArrayList;

/**
 * @ClassName GrayCode
 * @Author：Mayuan
 * @Date 2020/11/12 20:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 格雷编码的值。
 **/
public class GrayCode {

    public static ArrayList<Integer> grayCode(int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int num = 1 << n;
        for (int i = 0; i < num; i++) {
            res.add(i >> 1 ^ i);
        }
        return res;
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = grayCode(3);
        res.forEach(System.out::println);
    }
}
