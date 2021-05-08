package com.shuzu.www;

/**
 * @ClassName MaxGift
 * @Author：Mayuan
 * @Date 2020/10/8 16:02
 * @Description TODO
 * @Version 1.0
 * <p>
 * 礼物的最大值。
 * 从左上角到右下角的位置上的
 * 获得的礼物的最大值。
 * 最大礼物问题
 **/
public class MaxGift {

    public static int maxGift(int[][] gift) {
        int m = gift.length;
        int n = gift[0].length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) {
                    continue;
                }
                if (i == 0) {
                    gift[i][j] += gift[i][j - 1];
                } else if (j == 0) {
                    gift[i][j] += gift[i - 1][j];
                } else {
                    gift[i][j] += Math.max(gift[i][j - 1], gift[i - 1][j]);
                }
            }
        }
        return gift[m - 1][n - 1];
    }
}
