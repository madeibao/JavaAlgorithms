package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->NumberOfMatch
 * @description: 数字的补数内容
 * @author: MaYuan
 * @create: 2020-01-12 21:41
 * @version: 1.0
 * <p>
 * 给定一个正整数，输出它的补数。补数是对该数的二进制表示取反。
 * <p>
 * 注意:
 * <p>
 * <p>
 * 给定的整数保证在32位带符号整数的范围内。
 * 你可以假定二进制数不包含前导零位。
 * 示例 1:
 * <p>
 * 输入: 5
 * 输出: 2
 * 解释: 5的二进制表示为101（没有前导零位），其补数为010。所以你需要输出2。
 * <p>
 * <p>
 * 示例 2:
 * <p>
 * 输入: 1
 * 输出: 0
 * 解释: 1的二进制表示为1（没有前导零位），其补数为0。所以你需要输出0。
 **/
public class NumberOfMatch {
    public static int findComplement(int num) {
        int temp = 0;
        String str = Integer.toBinaryString(num);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '0') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        String str2 = sb.toString();
        temp = Integer.parseInt(str2, 2);
        return temp;
    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println(findComplement(num));
    }
}
