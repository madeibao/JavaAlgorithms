package com.algorithm.www;

/**
 * @ClassName ClimStair4
 * @Author：Mayuan
 * @Date 2020/12/28/0028 22:12
 * @Description TODO
 * @Version 1.0
 *
 * 爬楼梯算法4
 *
 **/
public class ClimStair4 {

    public static int clim(int n) {
        if(n<=0) {
            return -1;
        }
        else {
            if(n==1) {
                return 1;
            }
            else if(n==2) {
                return 2;
            }
            else{
                int a= 1;
                int b= 2;
                int res = 0;
                for(int i=2;i<n;i++) {
                    res = a+b;
                    a= b;
                    b =res;
                }
                return res;
            }
        }
    }
    public static void main(String[] args) {
        int n =5;
        System.out.println(clim(n));
    }
}
