package com.algorithm.www;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @program: JavaWorkSpace2->SaveBoat
 * @description: 通过救生艇，最少的数量
 * @author: MaYuan
 * @create: 2020-02-06 16:42
 * @version: 1.0
 * 第 i 个人的体重为 people[i]，每艘船可以承载的最大重量为 limit。
 * <p>
 * 每艘船最多可同时载两人，但条件是这些人的重量之和最多为 limit。
 * <p>
 * 返回载到每一个人所需的最小船数。(保证每个人都能被船载)。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：people = [1,2], limit = 3
 * 输出：1
 * 解释：1 艘船载 (1, 2)
 * 示例 2：
 * <p>
 * 输入：people = [3,2,2,1], limit = 3
 * 输出：3
 * 解释：3 艘船分别载 (1, 2), (2) 和 (3)
 * 示例 3：
 * <p>
 * 输入：people = [3,5,3,4], limit = 5
 * 输出：4
 * 解释：4 艘船分别载 (3), (3), (4), (5)
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/boats-to-save-people
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/

public class SaveBoat {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] line1 = bf.readLine().split(" ");
        int n = line1.length;
        int limit = Integer.parseInt(bf.readLine());
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(line1[i]);
        }

        // 首先来进行排序
        Arrays.sort(nums);
        int count = 0;
        int left = 0, right = n - 1;
        while (left <= right) {
            //两个人装不下，只能装后面那个胖子，右边指针左移
            if (nums[left] + nums[right] > limit) {
                count++;
                right--;
            } else {//能装下，左右指针都移动
                count++;
                left++;
                right--;
            }
        }
        System.out.println(count);
    }
}
