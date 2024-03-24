package com.algorithm.www;

/**
 * @ClassName KthDay
 * @Author：Mayuan
 * @Date 2021/4/25/0025 16:47
 * @Description TODO
 * @Version 1.0
 *
 * 判断一年之中的第多少天。
 **/

public class KthDay {
    public static void change(String str) {
        int[] months={31,28,31,30,31,30,31,31,30,31,30,31};
        System.out.println(str);
        String[] sourceStrString=str.split("\\.");
        int year=Integer.parseInt(sourceStrString[0]);
        int month=Integer.parseInt(sourceStrString[1]);
        int day=Integer.parseInt(sourceStrString[2]);

        // 判断闰年
        months[1]=(year%400==0||year%4==0&&year%100!=0) ? 29:28;
        int num=0;
        for(int i=1;i<month;i++) {
            num+=months[i];
        }
        System.out.println(num+day);
    }

    public static void main(String[] args) {
        change("1995.8.11");
    }
}
