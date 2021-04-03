package com.shuzu.www;

/**
 * @ClassName KthNumber2
 * @Author：Mayuan
 * @Date 2021/3/25/0025 9:52
 * @Description TODO
 * @Version 1.0
 *
 * 第k大的数字
 * 递归的写法来实现。
 *
 **/
public class KthNumber2 {

    public int findKthLargest(int[] nums, int k) {
        return findK(nums, k, 0,nums.length-1);
    }
    public int findK(int[] nums, int k, int start, int end) {
        int low = start;
        int high = end;
        int temp = nums[low];
        while (low<high) {
            while (low<high&&nums[high]<=temp) {
                high--;
            }
            nums[low] = nums[high];
            while (low<high&&nums[low]>=temp) {
                low++;
            }
            nums[high] = nums[low];
        }


        // 把分割数组的轴选出
        nums[high] = temp;
        if(high==k-1) {
            return temp;
        }

        // 表示递归的部分在左面。
        else if(high>k-1) {
            return findK(nums, k, start, high-1);
        }
        // 表示递归的部分在右面。
        else {
            return findK(nums, k, high+1, end);
        }
    }

    public static void main(String[] args) {
        int[] nums ={4,2,3,1,5,9,10,24,6,8,7};
        int k =2;
        KthNumber2 k2 = new KthNumber2();
        System.out.println(k2.findKthLargest(nums, k));

    }
}
