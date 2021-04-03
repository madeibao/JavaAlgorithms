package com.sort.www;

/**
 * @program: JavaWorkSpace2->QuickSort3
 * @description: 快速排序
 * @author: MaYuan
 * @create: 2019-12-27 20:42
 * @version: 1.0
 **/
public class QuickSort3 {
    public static void main(String[] args) {
        int[] a = {2,3,5,4,6,8};
        System.out.println("sort before:");
        printArray(a);
        quickSort(a, 0, a.length - 1);
        System.out.println("after quickSort:");
        printArray(a);
    }

    public static void quickSort(int[] a, int low, int high) {
        if (low < high) {
            int middle = getMiddle(a, low, high);
            //递归处理比基准小的左边的数
            quickSort(a, low, middle - 1);
            //递归处理比基准大的右边的数
            quickSort(a, middle + 1, high);
        }
    }

    public static int getMiddle(int[] a, int low, int high) {
        //选择数组第一位作为基准
        int temp = a[low];
        while (low < high) {

            //顺序很重要，要先从数组高端开始找

            //这里强调优先从high开始， 且每次内层循环的时候要求low小于high，是为了避免出现

            //“如果low找到比基准大，而high没有找到比基准小的”现象

            while (low < high && a[high] > temp) {
                high--;
            }

            //再找低端的
            while (low < high && a[low] < temp) {
                low++;
            }
            //交换两个数在数组中的位置

            if (low < high) {
                int t = a[low];
                a[low] = a[high];
                a[high] = t;
            }
        }

        //将基准数归位
        a[low] = temp;
        //返回的是基准的值。
        return low;
    }

    public static void printArray(int[] numbers) {
        for (int i : numbers) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
}


