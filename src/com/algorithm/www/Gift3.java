package com.algorithm.www;

/**
 * @ClassName Gift3
 * @Author：Mayuan
 * @Date 2020/10/9 9:17
 * @Description TODO
 * @Version 1.0
 * 牛妹的礼物的最大值。
 **/
public class Gift3 {

    public static int maxGift(int[][] gift) {
        int m = gift.length;
        int n = gift[0].length;
        for (int i = 1; i < m; i++) {
            gift[i][0] += gift[i - 1][0];
        }

        for (int j = 1; j < n; j++) {
            gift[0][j] += gift[0][j - 1];
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                gift[i][j] += Math.max(gift[i - 1][j], gift[i][j - 1]);
            }
        }

        return gift[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] temp = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        System.out.println(maxGift(temp));
    }
}
