package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombineTest
 * @Author：Mayuan
 * @Date 2020/3/21 16:14
 * @Description TODO
 * @Version 1.0
 * <p>
 * 求一个数字内的组合
 **/
public class CombineTest {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        getAns(1, n, k, new ArrayList<Integer>(), ans);
        return ans;
    }

    private void getAns(int start, int n, int k, ArrayList<Integer> temp, List<List<Integer>> ans) {
        if (temp.size() == k) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        for (int i = start; i <= n - (k - temp.size()) + 1; i++) {
            temp.add(i);
            getAns(i + 1, n, k, temp, ans);
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {

        List<List<Integer>> res = new CombineTest().combine(4, 2);
        for (List<Integer> r : res) {
            for (Integer i : r) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
