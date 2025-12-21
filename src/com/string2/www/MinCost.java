package com.string2.www;

public class MinCost{
    public long minCost(String str, int[] cost) {
        long[] const2 = new long[26];
        long totalCost = 0;
        for (int i = 0; i < cost.length; i++) {
            totalCost += cost[i];
            char c = str.charAt(i);
            const2[c - 'a'] += cost[i];
        }

        long maxCost = 0;
        for(int i=0;i<26;i++) {
            maxCost = Math.max(maxCost, const2[i]);
        }
        return totalCost - maxCost;
    }

    public static void main(String[] args) {

        String str = "aabaac";
        int[] nums = new int[]{1,2,3,4,1,10};
        MinCost minCost = new MinCost();
        System.out.println(minCost.minCost(str, nums));
    }
}