package com.shuzu.www;

/**
 * @ClassName TencentCoin
 * @Author：Mayuan
 * @Date 2020/5/29 22:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 腾讯笔试题
 * 拼凑硬币
 * <p>
 * 1 拼凑硬币：
 * 时间限制：每个case 2s 空间限制：128MB
 * 小Q十分富有，拥有非常多的硬币，且拥有的硬币是有规律的，对于所有的非负整数K，他恰好各有两个面值为2^K的硬币，所以小Q拥有的硬币就是：
 * 1 1 2 2 4 4 8 8 16 16-----------
 * 小Q有一天在商店买东西需要支付n元，小Q想知道有多少种方案从他拥有的硬币中选取一些恰好凑够n元。
 * （提示：如果两种方案某个面值的硬币选取的个数不一样就视为不一样的方案）
 * <p>
 * 输入：
 * 输入包括一个整数n（1<=n<=10^18）,表示他需要支付的钱，请注意n的范围。
 * 输出：
 * 输出一个整数，表示小Q可以拼凑出n元钱的方案数。
 * <p>
 * 样例输入：6
 * 样例输出：3
 * <p>
 * 分析：他所拥有的钱币是 1 1 2 2 4 4 8 8 -----------2^k（两个）
 * <p>
 * n=6
 * 6=4+2
 * 6=4+1+1
 * 6=2+2+1+1 故而方案3种
 * <p>
 * 第一种方法：递归
 * 当n为偶数的时候 F（n）=F（n/2-1）+F（n/2）
 * 当n为奇数的时候 F（n）=F（n/2）
 * 边界为F（0）=F（1）=1
 * <p>
 * 由此可得一系列结果：
 * F（1）=1 F（2）=2
 * F（3）=1 F（4）=3
 * F（5）=2 F（6）=3
 * F（7）=1 F（8）=4
 * F（9）=3 F（10）=5
 * ————————————————
 * 版权声明：本文为CSDN博主「孤傲小二~阿沐」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/weixin_43949535/article/details/89481160
 **/
public class TencentCoin {

    private static long num(int n) {
        if (n == 1 || n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return num(n / 2) + num(n / 2 - 1);
        } else {
            return num(n / 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(num(6));
    }
}
