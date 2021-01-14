package com.shuzu.www;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Permutation5
 * @Author：Mayuan
 * @Date 2020/2/25 21:12
 * @Description TODO
 * @Version 1.0
 * <p>
 * 字符数组的全排列
 **/
public class Permutation5 {

    private static void permu(char[] ch, int start) {
        List<String> res = new ArrayList<>();
        if (start == ch.length - 1) {
            System.out.println(new String(ch));
        } else {
            for (int i = start; i < ch.length; i++) {
                exchange(ch, start, i);
                permu(ch, start + 1);
                exchange(ch, start, i);
            }
        }
    }

    private static void exchange(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    public static void main(String[] args) {
        char[] ch = {'a', 'b', 'c'};
        permu(ch, 0);
    }

}

