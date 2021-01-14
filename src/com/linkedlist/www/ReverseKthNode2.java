package com.linkedlist.www;

/**
 * @ClassName ReverseKthNode2
 * @Author：Mayuan
 * @Date 2020/5/14 11:13
 * @Description TODO
 * @Version 1.0
 * <p>
 * 从链表的节点倒数位置开始算起
 **/
public class ReverseKthNode2 {

    private static ListNode reverseList2(ListNode head) {
        //前指针节点
        ListNode prev = null;
        //当前指针节点
        ListNode curr = head;
        //每次循环，都将当前节点指向它前面的节点，然后当前节点和前节点后移
        while (curr != null) {
            //临时节点，暂存当前节点的下一节点，用于后移
            ListNode nextTemp = curr.next;
            //将当前节点指向它前面的节点
            curr.next = prev;
            //前指针后移
            prev = curr;
            //当前指针后移
            curr = nextTemp;
        }
        return prev;
    }

    public static ListNode reversePart(ListNode head, int k) {
        ListNode temp = head;
        for (int index = 1; index < k && temp != null; index++) {
            temp = temp.next;
        }
        if (temp == null) {
            return head;
        }
        ListNode rNode = temp.next;
        temp.next = null;
        ListNode reverseNode = reverseList2(head);
        ListNode partNode = reversePart(rNode, k);
        head.next = partNode;
        return reverseNode;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8,};
        ListNode temp = new ListNode(nums);

        // 第一次翻转链表
        ListNode temp2 = reverseList2(temp);
        ListNode res = reversePart(temp2, 3);

        //第二次整体翻转链表。
        ListNode res2 = reverseList2(res);
        System.out.println(res2);
    }

}
