package com.linkedlist.www;

import java.util.HashSet;

/**
 * @ClassName DeleteDuplicateNode
 * @Author：Mayuan
 * @Date 2020/2/27 11:15
 * @Description TODO
 * @Version 1.0
 * <p>
 * <p>
 * 删除重复的节点
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 * <p>
 * 示例1:
 * <p>
 * 输入：[1, 2, 3, 3, 2, 1]
 * 输出：[1, 2, 3]
 **/
public class DeleteDuplicateNode {

    public static ListNode removeDuplicateNodes(ListNode head) {
        for (ListNode i = head; i != null; i = i.next) {
            for (ListNode j = i; j != null && j.next != null; ) {
                if (j.next.val == i.val) {
                    j.next = j.next.next;
                } else {
                    j = j.next;
                }
            }
        }
        return head;
    }

    public static ListNode removeDuplicateNodes2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        HashSet<Integer> set = new HashSet<Integer>();
        set.add(head.val);
        ListNode temp = head;
        while (temp.next != null) {

//            boolean add​(E e) 将指定的元素添加到此集合（如果尚未存在）。
            if (set.add(temp.next.val)) {
                temp = temp.next;
            } else {
                temp.next = temp.next.next;
            }
        }
        return head;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 3, 2, 1};
        ListNode node = new ListNode(nums);
        ListNode temp = removeDuplicateNodes(node);
        System.out.println(temp);

    }
}
