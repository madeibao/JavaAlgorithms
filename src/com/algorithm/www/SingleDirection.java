package com.algorithm.www;

/**
 * @program: JavaWorkSpace2->SingleDirection
 * @description: 判断一个数组是否单调递增或递减
 * @author: MaYuan
 * @create: 2019-12-25 20:30
 * @version: 1.0
 **/
public class SingleDirection {
    public static boolean isMonotonic(int[] A) {
        int num = lookArray(A);
        if (num == 1 || num == -1) {
            return true;
        }
        return false;
    }

    /**
     * 根据数组需要冒泡的次数判断数组为顺序,逆序还是无序
     */
    public static int lookArray(int[] array) {
        // 冒泡的次数
        int count = 0;
        // 上一次交换的"气泡"
        int pop = array[0];
        // 利用单次冒泡检验数组需要冒泡的次数
        for (int j = 0; j < array.length - 1; j++) {
            if (array[j] > array[j + 1]) {
                // 判断此次需要向上冒的气泡是否和上次的相同,不同为乱序
                if (pop != array[j]) {
                    // 若气泡发生了变化,证明是无序的,停止遍历,返回 0
                    return 0;
                }
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                // 两相邻元素交换一次值,count计数一次

                count++;
                pop = array[j + 1];
                //气泡向右移动，可能是逆序，对于逆序序列，还需保证气泡左侧所有的元素大于右侧
                //所以当左侧最小的元素小于右侧元素时，为无序序列
                if (j + 2 < array.length) {
                    if (array[j] < array[j + 2]) {
                        return 0;
                    }
                }
            }
        }
        // 正序返回 1, 倒序返回 -1
        if (count == 0) {
            return 1;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {

//    	int [] num= {1,3,2};
        int[] num = {5, 4, 2, 1};
        int[] num2 = {1, 2, 3, 7, 5};
        System.out.println(isMonotonic(num));
    }
}
