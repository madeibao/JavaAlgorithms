package com.shuzu.www;

/**
 * @ClassName JumpFloor
 * @Author：Mayuan
 * @Date 2021/3/19/0019 21:02
 * @Description TODO
 * @Version 1.0
 *
 * 变态跳台阶。
 *
 **/
public class JumpFloor {
    int jumpFloorII(int number) {
        int method=1;
        if(number<=0) {
            return 0;
        }
        else{
            method=(int)Math.pow(2,number-1);
        }
        return method;
    }

    public static void main(String[] args) {
        System.out.println(new JumpFloor().jumpFloorII(3));
    }
}
