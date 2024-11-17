package com.system.www;

import java.util.TreeSet;

/**
 * @ClassName SmallestInfiniteSet
 * @Author：Mayuan
 * @Date 2024/11/17/星期日 21:02
 * @Description TODO
 * @Version 1.0
 **/
public class SmallestInfiniteSet {

    private int nums;
    private TreeSet<Integer> set2;

    public SmallestInfiniteSet() {
        set2 = new TreeSet<>();
        nums = 1;
    }

    public int popSmallest() {
        if(set2.isEmpty()) {
            int ans = nums;
            ++nums;
            return ans;
        }
        int num2 = set2.pollFirst();
        return num2;
    }

    public void addBack(int num) {
        if(num<nums) {
            set2.add(num);
        }
    }

    public static void main(String[] args) {


    }
}
