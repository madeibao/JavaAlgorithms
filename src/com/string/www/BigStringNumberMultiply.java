package com.string.www;

/**
 * @program: JavaWorkSpace2->BigStringNumberMultiply
 * @description: 两个大数进行相乘
 * @author: MaYuan
 * @create: 2019-12-28 09:53
 * @version: 1.0
 * <p>
 * 两个超大的数字进行乘积的运算。
 **/
public class BigStringNumberMultiply {
    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int length1 = num1.length();
        int length2 = num2.length();
        StringBuilder str = new StringBuilder();
        int[] arrayInt = new int[length1 + length2];

        for (int i = length1 - 1; i >= 0; i--) {
            for (int z = length2 - 1; z >= 0; z--) {
                int number1 = num1.charAt(i) - 48;
                int number2 = num2.charAt(z) - 48;
                arrayInt[i + z] += number1 * number2;

                if (arrayInt[i + z] >= 10 && (i + z) != 0) {
                    //进位的操作。
                    arrayInt[i + z - 1] += arrayInt[i + z] / 10;
                    arrayInt[i + z] = arrayInt[i + z] % 10;
                }
            }
        }

        for (int i = 0; i <= length1 + length2 - 2; i++) {
            str.append(arrayInt[i]);
        }
        // 返回成字符串的形式来进行存储。
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(multiply("123", "456"));
    }
}



