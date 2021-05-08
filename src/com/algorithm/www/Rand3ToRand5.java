package com.algorithm.www;

import java.util.Random;

/**
 * @ClassName Rand3ToRand5
 * @Author：Mayuan
 * @Date 2021/4/3/0003 11:22
 * @Description TODO
 * @Version 1.0
 *
 *
 * 随机数字3生成随机数字5
 *
 **/
public class Rand3ToRand5 {
    static int rand3() {
        return new Random().nextInt(3)+1;
    }

    static int rand5() {
        int x = 0;
        do {
            x = 3*(rand3()-1)+rand3();
        }while (x>5);
        return x;
    }

    public static void main(String[] args) {
        for(int i =0;i<10;i++) {
            System.out.println(rand5());
        }
    }
}
