package com.linkedlist.www;

/**
 * @ClassName DeleteRepeatNode2
 * @Author：Mayuan
 * @Date 2020/6/25 15:52
 * @Description TODO
 * @Version 1.0
 * <p>
 * 删除排序链表中的重复的节点
 * 首先链表是排好序的。
 * <p>
 * 把链表中的所有的从夫的节点都进行删除。
 **/
public class DeleteRepeatNode2 {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode dummy = new ListNode(0);
        ListNode preNode = dummy;
        ListNode currNode = head;
        ListNode realNode = dummy;
        while (currNode != null) {
            if ((preNode == dummy || currNode.val != preNode.val) && (currNode.next == null || currNode.val != currNode.next.val)) {
                realNode.next = currNode;
                realNode = currNode;
            }
            preNode = currNode;
            currNode = currNode.next;
            //断掉链接
            preNode.next = null;
        }
        return dummy.next;
    }


    private static ListNode deleteDuplicates2(ListNode head) {
        if (head == null) {
            return null;
        }

        if (head.next != null && head.val == head.next.val) {
            while (head.next != null && head.val == head.next.val) {
                head = head.next;
            }
            return deleteDuplicates(head.next);
        } else {
            head.next = deleteDuplicates(head.next);
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode temp = new ListNode(new int[]{1, 2, 3, 3, 4, 4, 5, 6});
        ListNode res = deleteDuplicates2(temp);
        System.out.println(res);
    }
}

