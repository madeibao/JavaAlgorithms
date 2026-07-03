package com.recursive.www;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @ClassName HanoTa
 * @Author Mayuan
 * @Date 2026/7/3/星期五 17:22
 * @Version 1.0
 **/
public class HanoTa {
    public void hanoMove(List<Integer> A, List<Integer> B, List<Integer> C) {
        int N = A.size();
        move(N, A, B, C);
    }

    public void move(int N, List<Integer> A, List<Integer> B, List<Integer> C) {
        // 只有一个，从A移动到C
        if (N == 1) {
            C.addFirst(A.removeFirst());
            return;
        }
        move(N - 1, A, C, B);          //  A中N-1层移到B, 需要借助C
        C.addFirst(A.removeFirst());       //  A中最后一层移到C
        move(N - 1, B, A, C);          //  B的N-1层移到C， 同时借助A
    }

    public static void main(String[] args) {
        List<Integer> A = new ArrayList<>();
        A.add(1);
        A.add(2);
        A.add(3);
        List<Integer> B = new ArrayList<>();
        List<Integer> C = new ArrayList<>();

        new HanoTa().hanoMove(A, B, C);
        for (var j : C) {
            System.out.print(j + " ");
        }
    }
}
