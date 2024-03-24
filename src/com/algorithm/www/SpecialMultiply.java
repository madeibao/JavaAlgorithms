package com.algorithm.www;

/**
 * @ClassName SpecialMultiply
 * @Author：Mayuan
 * @Date 2020/2/27 10:48
 * @Description TODO
 * @Version 1.0
 * <p>
 * 不用* 号，来实现两个数字的乘法运算
 * <p>
 * 为了提高速度，需要用到乘法的交换律， 3 x 4 = 3 + 3 + 3 + 3, 等价于 4 x 3 = 4 + 4 + 4 但是后者少了一次运算。
 * <p>
 * 因此加了一条if (A < B) swap(A,B); 保证每次都是A大B小
 * <p>
 * 作者：xu-zhou-geng
 * 链接：https://leetcode-cn.com/problems/recursive-mulitply-lcci/solution/cpp-san-xing-dai-ma-shuang-100-by-xu-zhou-geng/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 **/
public class SpecialMultiply {

    public static int multiply(int A, int B) {
        if (B == 0) {
            return 0;
        }
        if (A < B) {
            swap(A, B);
        }
        return A + multiply(A, B - 1);
    }

    private static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
    public static void main(String[] args) {

        int a = 3, b = 4;
        System.out.println(multiply(a, b));
    }
}
