package com.shuzu.www;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @ClassName TopKthNumber
 * @Author：Mayuan
 * @Date 2020/9/26 16:26
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 求一个数组的前k个高频的数字。
 **/


public class TopKthNumber {
    class Pair {
        int num;
        int freq;

        public Pair(int num, int freq) {
            this.num = num;
            this.freq = freq;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        // 统计每个数字出现的次数
        Map<Integer, Integer> counterMap = IntStream.of(nums).boxed().collect(Collectors.toMap(e -> e, e -> 1, Integer::sum));
        // 构造Pair数组，Pair.num 表示数值，Pair.freq 表示数字出现的次数
        Pair[] pairs = IntStream.of(nums).distinct().boxed().map(num -> new Pair(num, counterMap.get(num))).toArray(Pair[]::new);
        // 使用快排变形 O(N) 获取Pair数组中频次最大的 k 个元素（第 4 个参数是下标，因此是 k - 1）。
        Pair[] topKPairs = quickSelect(pairs, 0, pairs.length - 1, k - 1);

        // 构造返回结果
        int[] res = new int[k];
        int idx = 0;
        for (Pair pair : topKPairs) {
            res[idx++] = pair.num;
        }
        return res;
    }

    private Pair[] quickSelect(Pair[] pairs, int lo, int hi, int idx) {
        if (lo > hi) {
            return new Pair[0];
        }
        // 快排切分后，j 左边的数字出现的次数都大于等于 pairs[j].freq，j 右边的数字出现的次数都小于等于 pairs[j].freq。
        int j = partition(pairs, lo, hi);
        // 如果 j 正好等于目标idx，说明当前pairs数组中的[0, idx]就是出现次数最大的 K 个元素。
        if (j == idx) {
            return Arrays.copyOf(pairs, idx + 1);
        }
        // 否则根据 j 与 idx 的大小关系判断找左段还是右段
        return j < idx ? quickSelect(pairs, j + 1, hi, idx) : quickSelect(pairs, lo, j - 1, idx);
    }

    private int partition(Pair[] pairs, int lo, int hi) {
        Pair v = pairs[lo];
        int i = lo, j = hi + 1;
        while (true) {
            while (++i <= hi && pairs[i].freq > v.freq) ;
            while (--j >= lo && pairs[j].freq < v.freq) ;
            if (i >= j) {
                break;
            }
            Pair tmp = pairs[i];
            pairs[i] = pairs[j];
            pairs[j] = tmp;
        }
        pairs[lo] = pairs[j];
        pairs[j] = v;
        return j;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;
        TopKthNumber bb = new TopKthNumber();
        int[] res = bb.topKFrequent(nums, k);
        for (int j : res) {
            System.out.print(j + " ");
        }
    }
}
