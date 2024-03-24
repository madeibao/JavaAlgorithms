package com.shuzu.www;

import java.util.Arrays;

/**
 * @ClassName RotateShuzu
 * @Author：Mayuan
 * @Date 2020/3/17 11:08
 * @Description TODO
 * @Version 1.0
 * <p>
 * 数组元素的循环移位操作
 * 输入: [1,2,3,4,5,6,7] 和 k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右旋转 1 步: [7,1,2,3,4,5,6]
 * 向右旋转 2 步: [6,7,1,2,3,4,5]
 * 向右旋转 3 步: [5,6,7,1,2,3,4]
 **/
public class RotateShuzu {

    /**
     * 每次把数组中的元素移动一个位置,移动k轮
     *
     * @param array
     * @param k
     */
    public static void moveArrayElement01(int[] array, int k) {
        int length = array.length;
        // 假设移动的位数是newk,那么无论是向右还是向左移动newk+n*length个位置之后,移动到还是原来的位置
        int newk = k % length;
        int temp = 0;
        for (int i = 0; i < newk; i++) {
            // 这个temp保存的是这个数组的一个元素
            temp = array[length - 1];
            for (int j = length - 2; j >= 0; j--) {
                // 让后一个元素等于前面的元素,相当于后面的元素是被前面的元素覆盖了
                array[j + 1] = array[j];
            }
            // 第一个元素在每一个循环结束之后就要把之前的临时变量填充后进去
            // 因为临时变量保存的是每一次的最后一个位置的元素
            array[0] = temp;
        }
    }

    /**
     * 开辟一个新的数组,把旧的数组直接放在新数组中的正确的位置
     *
     * @param array
     * @param k
     */
    public static int[] moveArrayElement02(int[] array, int k) {
        int length = array.length;
        int newk = k % length;
        int[] newArray = new int[length];
        // 重复length次把元素从旧位置移动和到新位置
        for (int i = 0; i < length; i++) {
            // 求出元素新的位置
            // 注意是要取模的
            /**
             * 加上i=6(就是最后一个元素)
             * 移动的位置是3
             * 那么 (6+3)%7 = 2
             * 索引原来数组的索引为6(最后一个元素)
             * 在新数组中的索引为2.
             */
            int newPosition = (i + newk) % length;
            newArray[newPosition] = array[i];
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        int[] re = moveArrayElement02(nums, 3);
        System.out.println(Arrays.toString(re));
    }
}
