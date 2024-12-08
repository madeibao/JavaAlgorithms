package com.shuzu.www;

import java.util.Arrays;

/**
 *  游戏中的弱角色
 *
 * @ClassName WeakGameUser
 * @Author：Mayuan
 * @Date 2024/12/8/星期日 19:26
 * @Description TODO
 * @Version 1.0
 **/
public class WeakGameUser {

    public static int numberOfWeakCharacters(int[][] properties) {
        int count = 0;
        int defense = 0;
        Arrays.sort(properties, (o1, o2) -> {
            if (o1[0] != o2[0]) {
                return o2[0] - o1[0];
            }
            return o1[1] - o2[1];
        });

        for (int[] property : properties) {
            int tempDefense = property[1];
            if (tempDefense < defense) {
                count++;
            } else {
                defense = tempDefense;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[][] properties = new int[][]{{2, 2}, {3, 3}};
        int[][] properties2 = new int[][]{{1, 5}, {10,4},{4,3}};
        System.out.println(numberOfWeakCharacters(properties2));
    }
}
