package com.shuzu.www;

/**
 * @ClassName WeightSum
 * @Author：Mayuan
 * @Date 2020/4/8 16:48
 * @Description TODO
 * @Version 1.0
 * <p>
 * 砝码的计算过程
 * <p>
 * 题目描述
 * 现有一组砝码，重量互不相等，分别为m1,m2,m3…mn；
 * 每种砝码对应的数量为x1,x2,x3...xn。现在要用这些砝码去称物体的重量(放在同一侧)，问能称出多少种不同的重量。
 * <p>
 * 注：
 * <p>
 * 称重重量包括0
 * <p>
 * <p>
 * 方法原型：public static int fama(int n, int[] weight, int[] nums)
 * <p>
 * <p>
 * 输入描述:
 * 输入包含多组测试数据。
 * <p>
 * 对于每组测试数据：
 * <p>
 * 第一行：n --- 砝码数(范围[1,10])
 * <p>
 * 第二行：m1 m2 m3 ... mn --- 每个砝码的重量(范围[1,2000])
 * <p>
 * 第三行：x1 x2 x3 .... xn --- 每个砝码的数量(范围[1,6])
 * 输出描述:
 * 利用给定的砝码可以称出的不同的重量数
 * <p>
 * 示例1
 * 复制
 * 输入
 * 2
 * 1 2
 * 2 1
 * 输出
 * 复制
 * 5
 **/

import java.util.*;

public class WeightSum {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {

            // 砝码的种类
            int n = cin.nextInt();
            int[] weights = new int[n];
            int[] numbers = new int[n];
            for (int i = 0; i < n; i++)
                weights[i] = cin.nextInt();
            for (int i = 0; i < n; i++)
                numbers[i] = cin.nextInt();
            int result = function(n, weights, numbers);
            System.out.println(result);
        }
        cin.close();
    }

    public static int function(int n, int[] weights, int[] numbers) {
        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i <= numbers[0]; i++)
            set.add(i * weights[0]);

        // 从第二个砝码开始
        for (int i = 1; i < n; i++) {
            List<Integer> list = new ArrayList<Integer>(set);

            // 遍历砝码的个数
            for (int j = 1; j <= numbers[i]; j++) {
                for (int k = 0; k < list.size(); k++)
                    set.add(list.get(k) + j * weights[i]);
            }
        }
        return set.size();
    }
}