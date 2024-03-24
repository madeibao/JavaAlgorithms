package com.linkedlist.www;

/**
 * @ClassName MidOrderNode
 * @Author：Mayuan
 * @Date 2021/1/6/0006 22:36
 * @Description TODO
 * @Version 1.0
 *
 * 有序链表的中位数。
 **/
public class MidOrderNode {

    /**【快慢指针————求一个有序链表的中位数】*/
    public static double sortedListMedian(ListNode head) {
        if(head == null) {
            System.out.println("链表不能为空。");
        }

        // 两个速度不同的汽车，快车速度是慢车速度的两倍。
        // 快车到达终点，慢车走完一半。
        ListNode slow = head, fast = head;
        while(fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //说明链表有奇数个节点，此时slow正好是中位数
        if(fast.next == null) {
            return slow.val*1.0;
        }
        //说明链表有偶数个节点，此时(slow+slow.next)/2是中位数
        else {
            return (slow.val + slow.next.val) / 2.0;
        }
    }

    /**返回由一个数组生成的链表的头结点*/
    private static ListNode makeListByArray(int[] array) {
        ListNode dummyHead = new ListNode(-1);
        ListNode cur = dummyHead;
        for (int i = 0; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        return dummyHead.next;
    }
    //主函数
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5};
        ListNode head = makeListByArray(array);
        double ans = sortedListMedian(head);
        System.out.println(ans);
    }
}
