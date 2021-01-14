package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->PrimeNumber2
 * @description: 某一个范围内的素数
 * @author: MaYuan
 * @create: 2019-12-26 20:06
 * @version: 1.0
 * <p>
 * 如求10之内的质数，首先列出2~N-1的所有数，如果当前数为质数，则其倍数就是质数，如
 * <p>
 * 第一个质数为2，在2上画圈，其倍数4/6/8不是质数，划掉4/6/8，继续遍历
 * 下一个质数为3，在3上画圈，其倍数6/9不是质数，划掉6/9，继续遍历
 * 下一个质数为5，在5上画圈，没有倍数，继续遍历
 * 下一个质数为7，在7上画圈，没有倍数，继续遍历。
 **/
public class PrimeNumber2 {
    public int countPrimes(int n) {
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = 1;
        }
        for (int i = 2; i < n; i++) {
            //如果当前数为质数
            if (nums[i] == 1) {
                //将对应数的倍数变为0
                for (int j = 2; i * j < n; j++) {
                    nums[i * j] = 0;
                }
            }
        }
        //遍历数组，统计值为1的元素个数
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (nums[i] == 1) {
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(new PrimeNumber2().countPrimes(10));
    }
}
