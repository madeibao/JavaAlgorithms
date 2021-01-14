package com.algorithm.www;

/**
 * @ClassName ByteDanceNumberKth
 * @Author：Mayuan
 * @Date 2020/5/14 10:05
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字节跳动的常考的笔试题
 * <p>
 * 给定整数 n 和 k，找到 1 到 n 中字典序第 k 小的数字。
 * <p>
 * 注意：1 ≤ k ≤ n ≤ 109。
 * <p>
 * 示例 :
 * <p>
 * 输入:
 * n: 13   k: 2
 * <p>
 * 输出:
 * 10
 * <p>
 * 解释:
 * 字典序的排列是 [1, 10, 11, 12, 13, 2, 3, 4, 5, 6, 7, 8, 9]，所以第二小的数字是 10。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/k-th-smallest-in-lexicographical-order
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class ByteDanceNumberKth {
    public static int findKthNumber(int n, int k) {
        int curr = 1;
        k = k - 1;
        while (k > 0) {
            //计算前缀之间的step数
            int steps = getSteps(n, curr, curr + 1);
            //前缀间距太大，需要深入一层
            if (steps > k) {
                curr *= 10;
                //多了一个确定节点，继续-1
                k -= 1;
            }
            //间距太小，需要扩大前缀范围
            else {
                curr += 1;
                k -= steps;
            }
        }
        return curr;
    }

    private static int getSteps(int n, long curr, long next) {
        int steps = 0;
        while (curr <= n) {
            steps += Math.min(n + 1, next) - curr;
            curr *= 10;
            next *= 10;
        }
        return steps;
    }

    public static void main(String[] args) {
        System.out.println(findKthNumber(13, 2));
    }
}
