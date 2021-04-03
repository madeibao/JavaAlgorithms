package com.algorithm.www;

import java.util.Random;

/**
 * @ClassName Rand5ToRand7
 * @Author：Mayuan
 * @Date 2021/4/1/0001 17:07
 * @Description TODO
 * @Version 1.0
 *
 * 用随机数字5来生成随机数字7
 *
 **/
public class Rand5ToRand7 {

    Random random = new Random();

    /**
     * 生成数字1 2 3 4 5
     * @return
     */
    int rand5() {
        return random.nextInt(5) + 1;
    }

    /**
     *   0 5  10 15 20   //5 * (rand5() - 1)
     *   -------------
     *   1 6  11 16 21
     *   2 7  12 17
     *   3 8  13 18
     *   4 9  14 19
     *   5 10 15 20
     *
     * * * * * * * * * * * * *
     *   一共是21个数字， 然后分成三组，每组都是 1/3 的概率。
     */

    /**
     * @return
     * 用 5*5 = 25
     * 舍弃掉22 23 24 25等四个数字。
     */
    int rand7() {
        int x = 0;
        // 如果是22 23 24 25等数字，就舍弃掉。

        do {
            // 这样可以保证等概率的生成1-7的事情。

//            4*5+5 = 25  最大的范围是可以生成25.
            x = 5 * (rand5() - 1) + rand5();
        }while(x > 21);
        return 1 + x%7;
    }

    public static void main(String[] args) {
        Rand5ToRand7 r = new Rand5ToRand7();
        for (int i = 0; i < 20; i++) {
            System.out.print(r.rand7()+" ");
        }
    }
}
