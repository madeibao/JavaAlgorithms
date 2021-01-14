package com.shuzu.www;

/**
 * @program: Pro1->CountHalf
 * @description: 数组中出现次数多于一半的元素，
 * @author: MaYuan
 * @create: 2019-12-23 18:07
 * @version: 1.0
 * <p>
 * 计算一个数组中的元素出现次数大于数组长度的一半。
 **/
public class CountHalf {
    private static int couHalf(int[] array) {
        int len = array.length;
        if (len <= 0 || array == null) {
            return 0;
        }
        int time = 1;
        int temp = array[0];
        for (int i = 1; i < len; i++) {
            // 重新的开始计数的内容。
            if (time == 0) {
                temp = array[i];
                time = 1;
            } else {
                if (array[i] == temp) {
                    time += 1;
                } else {
                    time -= 1;
                }
            }
        }
        int result = 0;
        for (int i : array) {
            if (i == temp) {
                result += 1;
            }
        }
        if (result * 2 < len) {
            temp = 0;
        }
        return temp;
    }

    public static void main(String[] args) {
        int[] num1 = {1, 2, 3, 2, 2, 2, 5, 4, 2};
        System.out.println(couHalf(num1));
    }
}







