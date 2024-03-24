package com.string.www;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 * @ClassName FindSubString
 * @Author：Mayuan
 * @Date 2020/5/14 8:46
 * @Description TODO
 * @Version 1.0
 * <p>
 * 百度实习题目，找出其中的字符串。
 * <p>
 * 度度熊收到了一个只有小写字母的字符串S，他对S的子串产生了兴趣，S的子串为S中任意连续的一段。他发现，一些子串只由一种字母构成，他想知道在S中一共有多少种这样的子串。
 * 例如在串”aaabbaa”中，度度熊想找的子串有”a”,”aa”,”aaa”,”b”,”bb”五种。
 * <p>
 * （本题只考虑子串的种数，相同的子串在多个位置出现只算一次）
 * <p>
 * 输入
 * 输入只有一行，一个字符串，长度不超过100000，只由小写字母组成
 * 样例输入
 * aaabbaa
 * 输出
 * 输出一行，符合要求的子串种数
 * 样例输出
 * 5
 * 时间限制
 * ————————————————
 * 版权声明：本文为CSDN博主「m0_37681914」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/m0_37681914/article/details/77727518
 **/
public class FindSubString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(getNum(str));
    }

    private static int getNum(String str) {
        int index = 0;

        // 集合保持唯一的特性。
        Set<String> set2 = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            index = str.charAt(index) == str.charAt(i) ? index : i;
            set2.add(str.substring(index, i + 1));
        }
        return set2.size();
    }
}
