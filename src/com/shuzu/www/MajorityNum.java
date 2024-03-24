package com.shuzu.www;

import java.util.Arrays;
import java.util.HashMap;

/**
 * @program: Pro1->MajorityNum
 * @description: 找出一个数组中的众数的内容
 * @author: MaYuan
 * @create: 2019-12-24 18:32
 * @version: 1.0
 * <p>
 * 找出一个数组中的出现次数大于数组长度一半的的元素。
 **/
public class MajorityNum {
    private static int majorityElement(int[] num) {
        Arrays.sort(num);
        return num[num.length / 2];
    }

    private static int majorityElement2(int[] num) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>(15);
        for (int n : num) {
            map.put(n, map.getOrDefault(n, 0) + 1);
            if (map.get(n) > num.length / 2) {
                return n;
            }
        }
        //默认的条件下返回-1.
        return -1;
    }

    /**
     * 方法3，维护更新的方法内容。
     * 更新维护，赋值的方法。
     */

    private static int majorityElement3(int[] nums) {
        int count = 0;
        int major = nums[0];
        for (int num : nums) {
            if (num == major) {
                count += 1;
            }
            else {
                if (--count == 0) {
                    // 重新的进行内容的赋值的操作。
                    count = 1;
                    major = num;
                }
            }
        }
        return major;
    }

    public static void main(String[] args) {
        int[] num = {3, 2, 2, 3, 3, 3};
        System.out.println(majorityElement3(num));
    }
}
