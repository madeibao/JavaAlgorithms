package com.system.www;

import com.sun.source.tree.Tree;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

/**
 * @ClassName NumManageSystem
 * @Author：Mayuan
 * @Date 2024/11/17/星期日 17:44
 * @Description TODO
 * @Version 1.0
 **/
public class NumberContainers {
    // k->数字 v-下标有序集合
    Map<Integer, TreeSet<Integer>> indexMap;
    // k->下标 v->数字
    Map<Integer, Integer> map;

    public NumberContainers() {
        indexMap = new HashMap<Integer, TreeSet<Integer>>();
        map = new HashMap<>();
    }

    public void change(int index, int number) {
        if (map.containsKey(index)) {    // 下标是否被占用
            int x = map.get(index);
            indexMap.get(x).remove(index); // 从占用该下标的数字的下标集合移除该下标
            if (indexMap.get(x).isEmpty()) {
                indexMap.remove(x);
            }
        }
        map.put(index, number);
        indexMap.computeIfAbsent(number,  v-> new TreeSet<>());
        indexMap.get(number).add(index); // 添加下标到新的数字集合
    }

    public int find(int number) {
        if (!indexMap.containsKey(number)) {
            return -1;
        }
        return indexMap.get(number).first(); // 拿到有序集合的第一个
    }
}
