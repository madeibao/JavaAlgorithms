package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName BigNumberAfter
 * @Author：Mayuan
 * @Date 2020/12/14/0014 21:11
 * @Description TODO
 * @Version 1.0
 * <p>
 * leetcode 739
 * <p>
 * 请根据每日 气温 列表，重新生成一个列表。对应位置的输出为：要想观测到更高的气温，至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
 * <p>
 * 例如，给定一个列表 temperatures = [73, 74, 75, 71, 69, 72, 76, 73]，你的输出应该是 [1, 1, 4, 2, 1, 1, 0, 0]。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/daily-temperatures
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class BigNumberAfter {

    public int[] dailyTemperatures(int[] T) {
        int[] res = new int[T.length];
        for (int i = 0; i < T.length; i++) {
            int curr = T[i];
            if (curr < 100) {
                for (int j = i + 1; j < T.length; j++) {
                    if (T[j] > curr) {
                        res[i] = j - i;
                        break;
                    }
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] res = {73, 74, 75, 71, 69, 72, 76, 73};
        int[] res2 = new BigNumberAfter().dailyTemperatures(res);
        System.out.println(Arrays.toString(res2));
    }
}
