package com.algorithm.www;

/**
 * @ClassName Math36Add
 * @Author：Mayuan
 * @Date 2021/1/4/0004 22:18
 * @Description TODO
 * @Version 1.0
 *
 * 两个36进制的数字来进行相加求和。
 *
 **/
public class Math36Add {
    public static int getIntFromChar(char ch) {

        // ret的默认的值设置为 -1 
        int ret = -1;
        if (ch >='0' && ch <= '9') {
            ret = ch - '0';
        }
        else if (ch >= 'a' && ch <= 'z') {
            ret = (ch - 'a') + 10;
        }
        return ret;
    }

    public static String addFunWithStr(String param1, String param2) {

        StringBuffer stringBuffer = new StringBuffer();
        String symbol = "0123456789abcdefghijklmnopqrstuvwxyz";
        int param1Len = param1.length();
        int param2Len = param2.length();

        int i = param1Len - 1;
        int j = param2Len - 1;

        if (i < 0 || j < 0) {
            return null;
        }

        // temp设置的是表示进位值。
        int temp = 0;

        // 从后面向前面来相加。
        while (i >= 0 && j >= 0) {

            char ch_1 = param1.charAt(i);
            char ch_2 = param2.charAt(j);

            int v1 = getIntFromChar(ch_1);
            int v2 = getIntFromChar(ch_2);
            int ret = v1 + v2;

            if (ret >= 36) {
                int index = ret - 36 + temp;
                char sv = symbol.charAt(index);
                stringBuffer.append(sv);
                //进位
                temp = 1;
            }
            else {
                int index = ret + temp;
                char sv = symbol.charAt(index);
                stringBuffer.append(sv);
                temp = 0;
            }

            i--;
            j--;

        }

        while (i >= 0) {

            char ch_1 = param1.charAt(i);
            stringBuffer.append(ch_1);
            i--;
        }

        while (j >= 0) {
            char ch_2 = param2.charAt(i);
            stringBuffer.append(ch_2);
            j--;
        }

        return stringBuffer.reverse().toString();
    }


    public static void main(String[] args) {
        String result = addFunWithStr("1b", "2x");

        // 最终的结果也是依照16进制来表示。
        System.out.println("result = " + result);

    }
}
