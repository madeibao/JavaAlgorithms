package com.shuzu.www;


/**
 * @program: JavaWorkSpace2->DivideThreePart
 * @description: 将一个数组分成三个部分的内容
 * @author: MaYuan
 * @create: 2020-02-12 21:32
 * @version: 1.0
 **/
public class DivideThreePart {

    public static boolean canThreePartsEqualSum(int[] A) {
        int total = 0;
        for (int i : A) {
            total += i;
        }

        // 把总和平均的分成三个部分的内容。
        int averge = total / 3;
        int j = 0;
        total = 0;
        for (int i = 0; i < A.length; i++) {
            total += A[i];
            // 如果等于平均值的情况下就清零。
            if (total == averge) {
                // 统计是否一共有三个结果内容。
                j++;
                total = 0;
            }
        }
        return j == 3 && total == 0;
    }

    public static void main(String[] args) {
        int[] nums = {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1};
        System.out.println(canThreePartsEqualSum(nums));
    }
}
