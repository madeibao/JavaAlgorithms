package com.shuzu.www;

/**
 * @ClassName SumOfThree2
 * @Author：Mayuan
 * @Date 2021/3/16/0016 20:27
 * @Description TODO
 * @Version 1.0
 *
 * 数组的元素之和为0。
 *
 *
 **/
import java.util.*;

public class SumOfThree2 {
    public static ArrayList<ArrayList<Integer>> threeSum(int[] num) {
        ArrayList<ArrayList<Integer>> result=new ArrayList<>();
        Arrays.sort(num);
        for(int i=0;i<num.length;i++){
            if(i==0||num[i]>num[i-1]){
                int j=i+1;
                int k=num.length-1;
                while(j<k){
                    if(num[i]+num[j]+num[k]==0) {
                        ArrayList<Integer> list=new ArrayList<>();
                        list.add(num[i]);
                        list.add(num[j]);
                        list.add(num[k]);
                        result.add(list);
                        j++;
                        k--;
                        while(j<k&&num[j]==num[j-1]){
                            j++;
                        }
                        while(j<k&&num[k]==num[k+1]){
                            k--;
                        }
                    }
                    else if(num[i]+num[j]+num[k]<0){
                        j++;
                    }
                    else{
                        k--;
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums2 = {-2,0,1,1,2};
        List<ArrayList<Integer>> res = threeSum(nums2);
        for (List<Integer> t : res) {
            for (Integer i : t) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

}