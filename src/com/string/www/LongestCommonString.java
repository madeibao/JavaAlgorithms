package com.string.www;

/**
 * @ClassName LongestCommonString
 * @Author：Mayuan
 * @Date 2020/5/23 15:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最长的公共子序列
 * 我们在两条独立的水平线上按给定的顺序写下 A 和 B 中的整数。
 * <p>
 * 现在，我们可以绘制一些连接两个数字 A[i] 和 B[j] 的直线，只要 A[i] == B[j]，且我们绘制的直线不与任何其他连线（非水平线）相交。
 * <p>
 * 以这种方法绘制线条，并返回我们可以绘制的最大连线数。
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1,4,2], B = [1,2,4]
 * 输出：2
 * 解释：
 * 我们可以画出两条不交叉的线，如上图所示。
 * 我们无法画出第三条不相交的直线，因为从 A[1]=4 到 B[2]=4 的直线将与从 A[2]=2 到 B[1]=2 的直线相交。
 * 示例 2：
 * <p>
 * 输入：A = [2,5,1,2,5], B = [10,5,2,1,5,2]
 * 输出：3
 * 示例 3：
 * <p>
 * 输入：A = [1,3,7,1,7,5], B = [1,9,2,5,1]
 * 输出：2
 **/
public class LongestCommonString {
    public static int maxUncrossedLines(int[] A, int[] B) {
        int dp[][] = new int[A.length + 1][B.length + 1];
        for (int i = 0; i <= A.length; i++) {
            for (int j = 0; j <= B.length; j++) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0;
                } else {
                    if (A[i - 1] == B[j - 1]) {
                        dp[i][j] = dp[i - 1][j - 1] + 1;
                    } else {
                        dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                    }
                }
            }
        }
        return dp[A.length][B.length];
    }

    public static void main(String[] args) {
        int[] num1 = {1, 4, 2};
        int[] num2 = {1, 2, 4};
        System.out.println(maxUncrossedLines(num1, num2));
    }
}
