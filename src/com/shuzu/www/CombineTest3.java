package com.shuzu.www;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName CombineTest3
 * @Author：Mayuan
 * @Date 2020/3/21 16:44
 * @Description TODO
 * @Version 1.0
 **/
public class CombineTest3 {

    public List<List<Integer>> combine(int n, int k) {
        if (k == n || k == 0) {
            List<Integer> row = new LinkedList<>();
            for (int i = 1; i <= k; ++i) {
                row.add(i);
            }
            return new LinkedList<>(Arrays.asList(row));
        }
        // n - 1 里边选 k - 1 个
        List<List<Integer>> result = combine(n - 1, k - 1);
        //每个结果加上 n
        result.forEach(e -> e.add(n));
        //把 n - 1 个选 k 个的结果也加入
        result.addAll(combine(n - 1, k));
        return result;
    }

    public static void main(String[] args) {

        List<List<Integer>> res = new CombineTest3().combine(4, 2);
        for (List<Integer> r : res) {
            for (Integer i : r) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
