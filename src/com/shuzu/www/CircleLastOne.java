package com.shuzu.www;

import java.util.ArrayList;

/**
 * @ClassName CircleLastOne
 * @Author：Mayuan
 * @Date 2020/12/27/0027 9:51
 * @Description TODO
 * @Version 1.0
 *
 * 圆圈中的最后剩下的数字。
 * 剑指offer题目
 **/
public class CircleLastOne {

    private static int lastOne(int n, int m) {
        ArrayList<Integer> list = new ArrayList<>();
        int idx =0;
        for(int i=0;i<n;i++) {
            list.add(i);
        }
        while (n>1) {
            idx = (idx+m-1)%n;
            list.remove(idx);
            n--;
        }
        return list.get(0);
    }
    public static void main(String[] args) {
        int n= 5,m =3;
        System.out.println(lastOne(n, m));
    }
}
