package com.linkedlist.www;

import java.util.ArrayList;
import java.util.Collections;

/**
 * @ClassName HuiWenList4
 * @Author：Mayuan
 * @Date 2020/10/18 19:58
 * @Description TODO
 * @Version 1.0
 * <p>
 * 判断是否为回文链表2
 **/
public class HuiWenList4 {

    public static boolean huiwen(ListNode head) {
        if (head == null) {
            return true;
        }

        if (head.next == null) {
            return true;
        }

        ArrayList<Integer> list2 = new ArrayList<>();
        ListNode temp = head;
        while (temp != null) {
            list2.add(temp.val);
            temp = temp.next;
        }

        ArrayList<Integer> list3 = new ArrayList<>(list2);
        Collections.reverse(list3);
        if(list2.equals(list3)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        ListNode list2 = new ListNode(new int[]{1, 2, 1});
        System.out.println(huiwen(list2));
    }
}
