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

        nums[high] = temp;
        if(high==k-1) {
            return temp;
        }
        else if(high>k-1) {
            return findK(nums, k, start, high-1);
        }
        else {
            return findK(nums, k, high+1, end);
        }
        
    }
    public static void main(String[] args) {
        int[] nums ={1,2,3,4,5,6,7,9,10};
        int k =2;
        KthNumber2 k2 = new KthNumber2();
        System.out.println(k2.findKthLargest(nums, k));

    }
}
