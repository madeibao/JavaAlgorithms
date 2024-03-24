package com.dprogram.www;

/**
 * @program: Pro1->UniquePath
 * @description: 独一无二的路径问题解析
 * @author: MaYuan
 * @create: 2019-12-24 12:08
 * @version: 1.0
 * 注意: m 和 n 的值均不超过 100。下面我们首先分析一下这个题目：如图，如果有障碍物（黄色）的地方走不了，
 * 也就是去此地的路径个数是0。需要注意的是，如果障碍物在第一行或者第一列的情况，
 * 如果障碍物在第一行，那么第一行中障碍物之后的列的路径个数都是0，如果障碍物在第一列的话也是一样的道理。
 * 同62题一样，也有（m,n）= （m-1,n）+（m,n-1）。那么我们画个示例图，如下所示（数字代表到此方块的路径的总数）：
 * [
 * [0,0,0],
 * [0,1,0],
 * [0,0,0],
 * ]
 **/
public class UniquePath {
    private static int uniquePathWithObstacles(int[][] obstacleGrad) {
        // 代表的是行数。
        int m = obstacleGrad.length;
        // 代表的是列数。
        int n = obstacleGrad[0].length;
        int[][] resultArray = new int[m][n];

        // 首先初始话第一列的内容。
        for (int i = 0; i < m; i++) {
            if (obstacleGrad[i][0] != 1) {
                resultArray[i][0] = 1;
            } else {
                break;
            }
        }

        // 初始化第一行的内容。
        for (int j = 0; j < n; j++) {
            if (obstacleGrad[0][j] != 1) {
                resultArray[0][j] = 1;
            } else {
                break;
            }
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (obstacleGrad[i][j] == 1) {
                    resultArray[i][j] = 0;
                } else {
                    resultArray[i][j] = resultArray[i - 1][j] + resultArray[i][j - 1];
                }
            }
        }
        return resultArray[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] test = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0,}};
        System.out.println(uniquePathWithObstacles(test));
    }
}







