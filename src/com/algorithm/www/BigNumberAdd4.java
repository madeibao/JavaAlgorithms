package com.algorithm.www;

/**
 * @ClassName BigNumberAdd4
 * @Author：Mayuan
 * @Date 2021/6/2/0002 20:32
 * @Description TODO
 * @Version 1.0
 *
 *
 * 两个大数字的相加。
 *
 **/
public class BigNumberAdd4 {

    public static String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, add = 0;
        StringBuffer ans = new StringBuffer();
        while (i >= 0 || j >= 0 || add != 0) {
            int x = i >= 0 ? num1.charAt(i) - '0' : 0;
            int y = j >= 0 ? num2.charAt(j) - '0' : 0;
            int result = x + y + add;
            ans.append(result % 10);
            add = result / 10;
            i--;
            j--;
        }
        // 计算完以后的答案需要翻转过来
        ans.reverse();
        return ans.toString();
    }

    public static void main(String[] args) {

        String str2 ="133";
        String str3 ="235";
        System.out.println(addStrings(str2,str3));
    }
}
