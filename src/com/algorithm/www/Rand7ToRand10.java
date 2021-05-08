package com.algorithm.www;

import java.util.Random;

/**
 * @ClassName Rand7ToRand10
 * @Author：Mayuan
 * @Date 2021/4/3/0003 11:23
 * @Description TODO
 * @Version 1.0
 *
 * 
 **/
public class Rand7ToRand10 {

    static int rand7() {
        int x = new Random().nextInt(7)+1;
        return x;
    }
    static int rand10() {
        int row, col, idx;
        do {
            row = rand7();
            col = rand7();
            idx = col + (row - 1) * 7;
        } while (idx > 40);
        return 1 + (idx - 1) % 10;
    }
    public static void main(String[] args) {
        for(int i =0;i<100;i++) {
            System.out.println(rand10());
        }
    }
}

