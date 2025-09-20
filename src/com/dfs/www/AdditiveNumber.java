package com.dfs.www;

/**
 * 判断数字是不是累加数 1123581321
 * rabbit num
 * @ClassName AdditiveNumber
 * @Author：Mayuan
 * @Date 2025/9/20/星期六 18:20
 * @Version 1.0
 **/
public class AdditiveNumber {
    public boolean isAdditiveNumber(String num) {
        int len = num.length();
        for (int i = 1; i <= len / 2; i++) {
            for (int j = 1; j <= (len - i) / 2; j++) {
                if (additiveNumber(num.substring(0, i), num.substring(i, i + j), num.substring(i + j))) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean additiveNumber(String numa, String numb, String remaining) {
        if ((numa.length() > 1 && numa.startsWith("0")) || (numb.length() > 1 && numb.startsWith("0"))) {
            return false;
        }
        String sum = addNum(numa, numb);
        if (sum.equals(remaining)) {
            return true;
        }
        if (!remaining.startsWith(sum)) {
            return false;
        }
        return additiveNumber(numb, sum, remaining.substring(sum.length()));
    }

    public String addNum(String stra, String strb) {
        int lena = stra.length();
        int lenb = strb.length();
        int i = lena - 1;
        int j = lenb - 1;

        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || carry != 0) {
            int a = i >= 0 ? stra.charAt(i--) - '0' : 0;
            int b = j >= 0 ? strb.charAt(j--) - '0' : 0;

            int sum = a + b + carry;
            sb.append(sum % 10);
            carry = sum / 10;
        }
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(new AdditiveNumber().isAdditiveNumber("11235"));
    }
}
