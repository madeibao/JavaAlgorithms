package com.window.www;

/**
 *
 * @ClassName DietPlan
 * @Author Mayuan
 * @Date 2026/2/8/星期日 21:07
 * @Version 1.0
 **/
public class DietPlan {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int ans = 0;
        int n = calories.length;
        int T = 0;
        for (int i = 0; i < k - 1; i++) {
            T += calories[i];
        }
        int l = 0;
        int r = k - 1;
        while (r < n) {
            T += calories[r];
            if (T > upper) {
                ans++;
            } else if (T < lower) {
                ans--;
            }
            T -= calories[l];
            l++;
            r++;
        }
        return ans;
    }
}
