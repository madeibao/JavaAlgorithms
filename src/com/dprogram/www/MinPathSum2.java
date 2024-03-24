package com.dprogram.www;

/**
 * @ClassName MinPathSum2
 * @Author：Mayuan
 * @Date 2020/3/16 17:59
 * @Description TODO
 * @Version 1.0
 * <p>
 * 最短的路径和
 * 众所周知，牛妹有很多很多粉丝，粉丝送了很多很多礼物给牛妹，牛妹的礼物摆满了地板。
 * 地板是N\times MN×M的格子，每个格子有且只有一个礼物，牛妹已知每个礼物的体积。
 * 地板的坐标是左上角(1,1)  右下角（N, M）。
 * 牛妹只想要从屋子左上角走到右下角，每次走一步，每步只能向下走一步或者向右走一步或者向右下走一步
 * 每次走过一个格子，拿起（并且必须拿上）这个格子上的礼物。
 * 牛妹想知道，她能走到最后拿起的所有礼物体积最小和是多少？
 * 示例1
 * 输入
 * 复制
 * [[1,2,3],[2,3,4]]
 * <p>
 * 注意的是，这里的行和列并不会相等。
 **/
public class MinPathSum2 {
    public static int selectPresent(int[][] presentVolumn) {
        if (presentVolumn.length == 0) {
            return 0;
        }
        // write code here
        // 表示矩阵的行数
        int m = presentVolumn.length;

        // 表示矩阵的列数。
        int n = presentVolumn[0].length;

        int[][] dp = new int[m][n];
        dp[0][0] = presentVolumn[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = presentVolumn[0][i] + dp[0][i - 1];
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = presentVolumn[i][0] + dp[i - 1][0];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = presentVolumn[i][j] + Math.min(Math.min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]);
            }
        }
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3}, {2, 3, 4}};
        System.out.println(selectPresent(nums));
    }
}






