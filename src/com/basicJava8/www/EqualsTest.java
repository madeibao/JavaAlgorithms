package com.basicJava8.www;

/**
 * @ClassName EqualsTest
 * @Author：Mayuan
 * @Date 2020/10/25 19:10
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * equals 比较的是内容，
 * == 比较的是地址。
 **/
public class EqualsTest {
    public static void main(String[] args) {
        String str2 = "abc";
        String str3 = "abc";

        // true
        // true

        System.out.println(str2.equals(str3));
        System.out.println(str2 == str3);

        //true
        //false
        String str4 = new String("xyz");
        String str5 = "xyz";
        System.out.println(str4.equals(str5));
        System.out.println(str4 == str5);

        // true
        // true
        String str6 = "m" + "n" + "l";
        String str7 = "mnl";
        System.out.println(str6.equals(str7));
        System.out.println(str6 == str7);

    }
}
