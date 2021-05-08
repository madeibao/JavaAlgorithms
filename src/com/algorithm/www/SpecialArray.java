package com.algorithm.www;

import java.util.Scanner;

/**
 * @ClassName SpecialArray
 * @Author：Mayuan
 * @Date 2021/4/9/0009 20:33
 * @Description TODO
 * @Version 1.0
 *
 * 特殊的数字序列。
 * 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5
 * 求第n个数字。
 *
 **/
public class SpecialArray {
    static int findKth(int n) {
        int i= 1;
        int count =0;
        while (true) {
            for(int j=0;j<i;j++) {
                count+=1;
                if(count==n) {
                    break;
                }
            }
            if(count==n) {
                break;
            }
            else {
                i+=1;
            }
        }
        return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findKth(n));
    }
}
