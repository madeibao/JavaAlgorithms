package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->Candy2
 * @description: 分糖果的案例2
 * @author: MaYuan
 * @create: 2019-12-28 20:15
 * @version: 1.0
 * <p>
 * 排排坐，分糖果。
 * 我们买了一些糖果 candies，打算把它们分给排好队的 n = num_people 个小朋友。
 * 给第一个小朋友 1 颗糖果，第二个小朋友 2 颗，依此类推，直到给最后一个小朋友 n 颗糖果。
 * 然后，我们再回到队伍的起点，给第一个小朋友 n + 1 颗糖果，第二个小朋友 n + 2 颗，依此类推，直到给最后一个小朋友 2 * n 颗糖果。
 * 重复上述过程（每次都比上一次多给出一颗糖果，当到达队伍终点后再次从队伍起点开始），
 * 直到我们分完所有的糖果。注意，就算我们手中的剩下糖果数不够（不比前一次发出的糖果多），这些糖果也会全部发给当前的小朋友。
 * 返回一个长度为 num_people、元素之和为 candies 的数组，以表示糖果的最终分发情况（即 ans[i] 表示第 i 个小朋友分到的糖果数）。
 * 示例 1：
 * <p>
 * 输入：candies = 7, num_people = 4
 * 输出：[1,2,3,1]
 * 解释：
 * 第一次，ans[0] += 1，数组变为 [1,0,0,0]。
 * 第二次，ans[1] += 2，数组变为 [1,2,0,0]。
 * 第三次，ans[2] += 3，数组变为 [1,2,3,0]。
 * 第四次，ans[3] += 1（因为此时只剩下 1 颗糖果），最终数组变为 [1,2,3,1]。
 * <p>
 * 示例 2：
 * <p>
 * 输入：candies = 10, num_people = 3
 * 输出：[5,2,3]
 * 解释：
 * 第一次，ans[0] += 1，数组变为 [1,0,0]。
 * 第二次，ans[1] += 2，数组变为 [1,2,0]。
 * 第三次，ans[2] += 3，数组变为 [1,2,3]。
 * 第四次，ans[0] += 4，最终数组变为 [5,2,3]。
 **/


public class Candy2 {

    /**
     * 方法1
     */
    private static int[] distributeCandies(int candies, int num_people) {
        int curr_give = 0;
        int[] res = new int[num_people];

        while (candies > 0) {
            res[curr_give % num_people] += Math.min(++curr_give, candies);
            // 不断减去已经分到的糖果。
            candies -= curr_give;
        }
        return res;
    }

    /**
     * 方法2
     *
     * @param args
     */
    private int[] distributeCandies2(int candies, int num_people) {
        int[] res = new int[num_people];
        int n = 1;
        while (n * (n + 1) <= 2 * candies) {
            n++;
        }
        for (int i = 1; i < n; i++) {
            res[(i - 1) % num_people] += i;
            candies -= i;
        }
        res[(n - 1) % num_people] += candies;
        return res;
    }

    public static void main(String[] args) {
        int candies = 7, numPeople = 4;
        int[] nums = distributeCandies(candies, numPeople);
        for (int j : nums) {
            System.out.print(j + " ");
        }
    }
}



