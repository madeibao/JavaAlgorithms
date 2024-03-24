package com.algorithm.www;

/**
 * @ClassName ConvertInteger
 * @Author：Mayuan
 * @Date 2020/3/28 15:40
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数字A变成数字B所需要的进行的变换的位数
 * <p>
 * 整数转换。编写一个函数，确定需要改变几个位才能将整数A转成整数B。
 * <p>
 * 示例1:
 * <p>
 * 输入：A = 29 （或者0b11101）, B = 15（或者0b01111）
 * 输出：2
 * 示例2:
 * <p>
 * 输入：A = 1，B = 2
 * 输出：2
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/convert-integer-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ConvertInteger {

    public static int convertInteger(int A, int B) {
        //思考A变成B需要多少位变动
        //那么思考A和B的位运算 异或？相同的返回0 不同的反回1
        int c = A ^ B;
        //再判断C中有多少个1
        int result = 0;

        for (int i = 0; i < 32; i++) {
            if ((c & 1) == 1) {
                result++;
            }
            c >>= 1;
        }
        return result;
    }

    public static void main(String[] args) {
        int a = 1, b = 2;
        System.out.println(convertInteger(a, b));
    }
}
