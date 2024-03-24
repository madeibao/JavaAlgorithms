package com.shuzu.www;

/**
 * @ClassName IntegerNalValue
 * @Author：Mayuan
 * @Date 2020/5/26 21:21
 * @Description TODO
 * @Version 1.0
 * <p>
 * 一个数组经过旋转之后的中间的数字
 * <p>
 * 搜索旋转数组。给定一个排序后的数组，包含n个整数，但这个数组已被旋转过很多次了，次数不详。请编写代码找出数组中的某个元素，假设数组元素原先是按升序排列的。若有多个相同元素，返回索引值最小的一个。
 * <p>
 * 示例1:
 * <p>
 * 输入: arr = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14], target = 5
 * 输出: 8（元素5在该数组中的索引）
 * 示例2:
 * <p>
 * 输入：arr = [15, 16, 19, 20, 25, 1, 3, 4, 5, 7, 10, 14], target = 11
 * 输出：-1 （没有找到）
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/search-rotate-array-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 **/
public class IntegerNalValue {
    public int search(int[] arr, int target) {
        return binarySearch(arr, target, 0, arr.length - 1);
    }

    private int binarySearch(int[] arr, int target, int l, int r) {
        if (l > r)
            return -1;
        if (l == r) {
            if (target == arr[l])
                return l;
            else
                return -1;
        }
        int mid = l + (r - l) / 2;
        //如果左区间为升序的话
        if (arr[l] < arr[mid]) {
            //target在左区间范围
            if (target <= arr[mid] && target >= arr[l])
                return binarySearch(arr, target, l, mid);
            else
                return binarySearch(arr, target, mid + 1, r);

        } else if (arr[l] > arr[mid]) {
            //左区间不为升序
            //还是以左区间搜索为优先, 如果条件成立，target还是在左区间中
            if (target <= arr[mid] || target >= arr[l]) {
                return binarySearch(arr, target, l, mid);
            } else {
                return binarySearch(arr, target, mid + 1, r);
            }
        } else {
            //此时左区间两端点值相同，是最坏的情况两边都需要搜索
            //[5,5,5,5,5,2,3,4,5]或[5,2,3,4,5,5,5,5,5]如果搜索2的话
            //这两种情况左右区间都有可能存在，所以如果左区间找到了不为-1，就返回，否则返回右区间找的结果。
            //如果这种情况还有优化的余地希望告知一下
            int res = binarySearch(arr, target, l, mid);
            if (res != -1) {
                return res;
            } else {
                return binarySearch(arr, target, mid + 1, r);
            }
        }
    }

    public static void main(String[] args) {


    }
}
