package com.string.www;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @ClassName StringSortTest
 * @Author：Mayuan
 * @Date 2020/3/27 17:19
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符串的各种变换处理
 **/
public class StringSortTest {

    public static String exchange(String str1, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str1);
        sb.append(str2);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();

        for (int i = 0; i < sb.length(); i++) {
            if (i % 2 == 0) {
                sb1.append(sb.charAt(i));
            } else {
                sb2.append(sb.charAt(i));
            }
        }
        String temp1 = sort(sb1.toString());
        String temp2 = sort(sb2.toString());

        char[] arr1 = temp1.toCharArray();
        char[] arr2 = temp2.toCharArray();

        char[] arr3 = new char[arr1.length + arr2.length];

        // 下面的内容用来交叉的进行添加。
        for (int i = 0; i < arr3.length; i++) {
            if (i % 2 == 0) {
                arr3[i] = arr1[i / 2];
            } else {
                arr3[i] = arr2[(i - 1) / 2];
            }
        }

        String a = "0123456789abcdefABCDEF";
        String b = "084C2A6E195D3B7F5D3B7F";
        for (int i = 0; i < arr3.length; i++) {
            if ((arr3[i] >= 'a' && arr3[i] <= 'f') || (arr3[i] >= 'A' && arr3[i] <= 'F') || (arr3[i] >= '0' && arr3[i] <= '9')) {
                arr3[i] = b.charAt(a.indexOf(arr3[i]));
            }
        }

        String str4 = new String(arr3);
        return str4;
    }

    /**
     * 字符串中的字符转换规律
     * String a = "0123456789abcdefABCDEF";
     * String b = "084C2A6E195D3B7F5D3B7F";
     *
     * @param s
     * @return private static char processChar(char c){//处理这些特殊字符，返回char型字符
     * int num = 0;//num代表该字符所代表的十六进制数字
     * if(c>='0'&&c<='9'){
     * num = Integer.parseInt(c+"");
     * }else if(c>='a'&&c<='f'){
     * num = c-87;
     * }else {
     * num = c-55;
     * }
     * return getReverseResult(num);//也就是对该十六进制数字进行处理
     * }
     * private static char getReverseResult(int num){//对该十六进制数字进行处理
     * String nums = reverseBinaryString(num);//对该数字进行转化为4位二进制数，然后反转。
     * int res = Integer.parseInt(nums,2);//之后再对返回后的二进制字符串转换为十进制数字
     * if(res>=0&&res<=9){//对十进制数字分两种情况转换为十六进制字符
     * return (res+"").charAt(0);
     * }else{
     * return (char)(res+55);
     * }
     * }
     * //对该数字进行转化为4位二进制数，然后反转，返回反转后的字符串
     * private static String reverseBinaryString(int num){
     * int k = 1<<3;
     * StringBuffer sb = new StringBuffer();
     * for(int i=0;i<4;i++){
     * int flag = ((num&k)==0?0:1);
     * sb.append(flag);
     * num=num<<1;
     * }
     * return sb.reverse().toString();
     * }
     */
    public static String sort(String s) {
        char[] ch = s.toCharArray();
        Arrays.sort(ch);
        String str2 = new String(ch);
        return str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String str = sc.nextLine();
            String[] str2 = str.split(" ");
            System.out.println(exchange(str2[0], str2[1]));
        }
    }
}


