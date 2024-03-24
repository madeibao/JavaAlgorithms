package com.algorithm.www;

/**
 * @ClassName BigNumberSub
 * @Author：Mayuan
 * @Date 2021/4/5/0005 17:10
 * @Description TODO
 * @Version 1.0
 *
 * 两个大数字相减算法。
 *
 **/
public class BigNumberSub {

    public static boolean compare(String num1,String num2) {
        if(num1.length()<num2.length())
            return  false;
        else if(num1.length()>num2.length())
            return true;
        else
            return num1.compareTo(num2)>0;
    }
    public static  String subtractString(String num1,String num2) {
        //正负号
        char sign='+';
        //让num1>num2 如果num1<num2 那么结果就是—(num2-num1)
        //可以先将num1和num2交换和前面情况统一
        if(!compare(num1,num2)) {
            sign='-';
            String team = num2;
            num2 = num1;
            num1 = team;
        }
        int len1=num1.length()-1;
        int len2=num2.length()-1;

        char[] ch1 = num1.toCharArray();
        char[] ch2 = num2.toCharArray();
        StringBuilder sb=new StringBuilder();
        //借位
        int borrow=0;
        while (len1>=0||len2>=0) {
            int n1=len1>=0?(ch1[len1--]-'0'):0;
            int n2=len2>=0?(ch2[len2--]-'0'):0;

            int num=n1-n2-borrow;
            borrow=0;
            //需要向前借位
            if(num<0) {
                borrow=1;
                num+=10;
            }
            sb.append(num);
        }

        //需要先翻转
        sb=sb.reverse();
        //去掉前面没用的’0‘
        int index = 0;
        while (index<sb.length()&&sb.charAt(index) == '0') {
            index++;
        }
        //如果两个数相同 直接返回"0"
        if(index==sb.length()) {
            return "0";
        }
        //
        if(sign=='+') {
            return  sb.substring(index);
        }
        else {
            //负数需要返回
            return sign+sb.substring(index);
        }
    }

    public static void main(String[] args) {
        String stra= "123";
        String strb= "123";
        System.out.println(subtractString(stra,strb));
    }
}
