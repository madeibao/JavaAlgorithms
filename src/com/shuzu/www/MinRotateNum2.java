package com.shuzu.www;

/**
 * @ClassName MinRotateNum2
 * @Author：Mayuan
 * @Date 2021/6/4/0004 15:15
 * @Description TODO
 * @Version 1.0
 * 旋转数组的最小值。
 * 应该用更好的时间复杂度来实现，而不是遍历。
 *
 **/
public class MinRotateNum2 {

    public static int minArray(int[] numbers) {

        int i=0,j = numbers.length-1;
        while(i<j) {
            int mid= (i+j)/2;
            if(numbers[mid]>numbers[j]) {
                i = mid+1;
            }
            else if(numbers[mid]<numbers[j]) {
                j = mid;
            }
            else {
                j-=1;
            }
        }

        return numbers[i];
    }

    public static void main(String[] args) {
        int[] nums ={3,4,5,1,2};
        System.out.println(minArray(nums));

    }
}
