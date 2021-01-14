package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CombineTest2
 * @Author：Mayuan
 * @Date 2020/3/21 16:27
 * @Description TODO
 * @Version 1.0
 * <p>
 * 组合，从其中选择元素的内容。
 **/
public class CombineTest2 {

    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        getAns(1, n, k, new ArrayList<Integer>(), ans);
        return ans;
    }

    private void getAns(int start, int n, int k, ArrayList<Integer> temp, List<List<Integer>> ans) {
        //如果 temp 里的数字够了 k 个，就把它加入到结果中
        if (temp.size() == k) {
            ans.add(new ArrayList<Integer>(temp));
            return;
        }
        //从 start 到 n
        for (int i = start; i <= n; i++) {
            //将当前数字加入 temp
            temp.add(i);
            //进入递归
            getAns(i + 1, n, k, temp, ans);
            //将当前数字删除，进入下次 for 循环
            temp.remove(temp.size() - 1);
        }
    }

    public static void main(String[] args) {
        List<List<Integer>> res = new CombineTest2().combine(4, 2);
        for (List<Integer> r : res) {
            for (Integer i : r) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
