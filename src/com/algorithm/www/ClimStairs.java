package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->climStairs
 * @description: 网上的爬楼梯的算法内容
 * @author: MaYuan
 * @create: 2020-01-10 15:38
 * @version: 1.0
 **/

public class ClimStairs {
    int total;

    /**
     * 递归调用
     *
     * @param n
     * @return
     */
    public int fib01(int n) {
        if (n == 1 || n == 2) {
            total = n;
        } else {
            total = fib01(n - 2) + fib01(n - 1);
        }
        return total;
    }

    /**
     * 三目运算符的解法来求解。
     *
     * @param n
     * @return
     */
    public int fib02(int n) {
        return (n == 1 || n == 2) ? n : fib02(n - 2) + fib02(n - 1);
    }

    // 备忘录法
    public int dfs(int n, int[] array) {
        if (array[n] != 0) {
            return array[n];
        } else {
            array[n] = dfs(n - 1, array) + dfs(n - 2, array);
            return array[n];
        }
    }

    public int fib03(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return n;
        } else {
            int[] array = new int[n + 1];
            array[1] = 1;
            array[2] = 2;
            return dfs(n, array);
        }
    }

    /**
     * 动态规划的算法来求解。
     *
     * @param n
     * @return
     */
    public int fib04(int n) {
        if (n == 0) {
            return 1;
        }

        int[] array = new int[n + 1];
        array[0] = 1;
        array[1] = 1;
        for (int i = 2; i <= n; i++) {
            array[i] = array[i - 1] + array[i - 2];
        }
        return array[n];
    }

    /**
     * 状态压缩法(又称滚动数组、滑动窗口，用于优化动态规划法的空间复杂度)
     */

    public int fib05(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        n = n - 1;
        int result = 0;
        int zero = 1;
        int first = 1;
        while (n > 0) {
            result = zero + first;
            zero = first;
            first = result;
            n--;
        }
        return result;
    }

    /**
     * 斐波那契数列
     *
     * @param n
     * @return
     */
    public int fib06(int n) {
        if (n == 0) {
            return 1;
        }
        if (n == 1 || n == 2) {
            return n;
        }
        int result = (int) Math.floor(
                1 / Math.sqrt(5) * (Math.pow((1 + Math.sqrt(5)) / 2, n + 1) - Math.pow((1 - Math.sqrt(5)) / 2, n + 1)));
        return result;
    }

    public void testClimb() {
        int num01 = fib01(7);
        System.out.println(num01);
        int num02 = fib02(8);
        System.out.println(num02);
        int num03 = fib03(0);
        System.out.println(num03);
        int num04 = fib04(8);
        System.out.println(num04);
        int num05 = fib05(8);
        System.out.println(num05);
        int num06 = fib06(2);
        System.out.println("用斐波那契数列的通项公式:" + num06);
    }

    public static void main(String[] args) {
        new ClimStairs().testClimb();
    }
}
