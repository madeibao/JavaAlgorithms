package com.shuzu.www;

/**
 * @ClassName ArrangeCoin
 * @Author：Mayuan
 * @Date 2020/3/21 22:30
 * @Description TODO
 * @Version 1.0
 * <p>
 * 安排硬币的排列内容
 * <p>
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * <p>
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * <p>
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * <p>
 * 示例 1:
 * <p>
 * n = 5
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第三行不完整，所以返回2.
 * 示例 2:
 * <p>
 * n = 8
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第四行不完整，所以返回3.
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/arranging-coins
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ArrangeCoin {

    public static int arrangeCoins(int n) {
        int i = 1;
        //n小于该行应有的个数则停止
        while (n >= i) {
            n -= i;
            i++;
        }
        return i - 1;
    }

    public static void main(String[] args) {
        int n = 8;
        System.out.println(arrangeCoins(n));
    }
}
