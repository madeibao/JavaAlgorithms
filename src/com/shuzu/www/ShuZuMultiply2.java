package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName ShuZuMultiply2
 * @Author：Mayuan
 * @Date 2020/12/26/0026 20:33
 * @Description TODO
 * @Version 1.0
 *
 * 构建乘积数组。
 *
 **/

public class ShuZuMultiply2 {
    public static int[] constructArr(int[] a) {
        if (a.length == 0) {
            return new int[]{0};
        }
        int temp = 1;
        int len = a.length;
        int[] res =new int[len];
        Arrays.fill(res,1);

        // 构建下三角形。
        for(int i = 1;i<len;i++) {
            res[i]= res[i-1]*a[i-1];
        }

        for(int i = len-2;i>=0;i--) {
            temp*= a[i+1];
            res[i]*= temp;
        }
        return res;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int[] res = constructArr(nums);
        System.out.println(Arrays.toString(res));
    }
}
