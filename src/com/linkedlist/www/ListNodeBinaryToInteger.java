package com.linkedlist.www;

/**
 * @program: JavaWorkSpace2->ListNodeBinaryToInteger
 * @description: 链表节点到数字的形式
 * @author: MaYuan
 * @create: 2020-01-29 21:30
 * @version: 1.0
 * <p>
 * 输入：head = [1,0,1]
 * 输出：5
 * 解释：二进制数 (101) 转化为十进制数 (5)
 **/
public class ListNodeBinaryToInteger {
    public static int getDecimalValue(ListNode head) {
        ListNode p = head;
        int result = 0;
        while (p != null) {
            result *= 2;
            result += p.val;
            p = p.next;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 0, 1};
        ListNode head = new ListNode(nums);
        System.out.println(getDecimalValue(head));
    }
}
