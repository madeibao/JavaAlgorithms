package com.sort.www;

/**
 * @program: JavaWorkSpace2->InsertSort3
 * @description: 插入排序的内容
 * @author: MaYuan
 * @create: 2020-01-08 21:35
 * @version: 1.0
 **/

interface IntCompare {
    public int cmp(int a, int b);
}

/**
 * 升序的形式来实现数组排序。
 */
class Cmp1 implements IntCompare {
    @Override
    public int cmp(int a, int b) {
        if (a > b) {
            return 1;
        } else {
            if (a < b) {
                return -1;
            } else {
                return 0;
            }
        }
    }
}

class Cmp2 implements IntCompare {
    @Override
    public int cmp(int a, int b) {
        if (a > b) {
            return -1;
        } else {
            if (a < b) {
                return 1;
            } else {
                return 0;
            }
        }
    }
}


/**
 * @author 马远
 */
public class InsertSort3 {

    private static void insertSort(int[] nums, IntCompare cmp) {
        if (nums != null) {
            for (int i = 1; i < nums.length; i++) {
                int temp = nums[i], j = i;
                if (cmp.cmp(nums[j - 1], temp) == 1) {
                    while (j >= 1 && cmp.cmp(nums[j - 1], temp) == 1) {
                        nums[j] = nums[j - 1];
                        j--;
                    }
                }
                nums[j] = temp;
            }
        }
    }

    public static void main(String[] args) {
        int[] nums = {7, 3, 19, 40, 4, 7, 1};
        System.out.println("升序");
        insertSort(nums, new Cmp1());
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }
}
