package com.shuzu.www;

import java.util.Scanner;

/**
 * @ClassName Coin2
 * @Author：Mayuan
 * @Date 2020/6/4 20:43
 * @Description TODO
 * @Version 1.0
 * <p>
 * 腾讯笔试题
 * <p>
 * 你有硬币，求
 * 拼凑硬币
 *  时间限制:（每个case）2s      空间限制：128MB
 * 小Q十分富有，拥有非常多的硬币，小Q拥有的硬币是有规律的，对于所有的非负整数K，小Q恰好各有两个面值为2^K的硬币，
 * 所以小Q拥有的硬币就是1,1,2,2,4,4,8,8,…。小Q有一天去商店购买东西需要支付n元钱，小Q想知道有多少种方案从他拥有的硬币中选取一些拼凑起来恰好是n元（如果两种方案某个面值的硬币选取的个数不一样就考虑为不一样的方案）。
 * 输入：
 * 输入包括一个整数n(1<=n<=10^18)，表示小Q需要支付多少钱。注意n的范围。
 * 输出：
 * 输出一个整数，表示小Q可以拼凑出n元钱放的方案数。
 * 【请注意：javascrip语言不支持调试，请同学们优先考虑使用其他语言，谢谢】
 * 样例输入：6
 * 样例输出：3
 * <p>
 * ————————————————
 * 版权声明：本文为CSDN博主「u010996775」的原创文章，遵循CC 4.0 BY-SA版权协议，转载请附上原文出处链接及本声明。
 * 原文链接：https://blog.csdn.net/u010996775/article/details/79258331
 **/
public class Coin2 {

    public static int FunNum(int n) {
        if (n == 0 || n == 1)
            return 1;
        if (n % 2 == 0)
            return FunNum(n / 2 - 1) + FunNum(n / 2);
        else {
            return FunNum(n / 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(FunNum(n));
    }
}




