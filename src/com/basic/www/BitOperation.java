package com.basic.www;

/**
 * @ClassName BitOperation
 * @Author：Mayuan
 * @Date 2020/2/27 16:16
 * @Description TODO
 * @Version 1.0
 * Java的位运算操作
 * <p>
 * 异或的性质
 * 两个数字异或的结果a^b是将 a 和 b 的二进制每一位进行运算，得出的数字。 运算的逻辑是
 * 如果同一位的数字相同则为 0，不同则为 1
 * <p>
 * 异或的规律
 * <p>
 * 任何数和本身异或则为0
 * <p>
 * 任何数和 0 异或是本身
 * <p>
 * 作者：fe-lucifer
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-shu-zi-chu-xian-de-ci-shu-lcof/solution/zhi-chu-xian-yi-ci-de-shu-xi-lie-wei-yun-suan-by-a/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class BitOperation {

    public static void main(String[] args) {

        int a = 3;
        int b = 4;
        //    011
        //    100
        // 所以与运算的结果为0
        System.out.println(a & b);

        // 或运算  111 结果为7
        System.out.println(a | b);

        // 异或运算  111 结果为7
        System.out.println(a ^ b);

        // 异或运算
        int c = 7;
        int d = 10;
        //     0111
        //     1010
        //     1101   -> 结果为13
        System.out.println(c ^ d);
    }
}




