package com.rajesh.practice.medium.newpack;

import com.rajesh.practice.easy.ListNode;

public class LinkedListCycleII
{
    public ListNode detectCycle(ListNode head)
    {
        if (head == null || head.next == null)
        {
            return null;
        }

        ListNode temp1 = head;
        ListNode temp2 = head;

        while (temp2 != null)
        {
            temp1 = temp1.next;
            temp2 = temp2.next != null ? temp2.next.next : null;
            if (temp1 == temp2)
            {
                while (temp1 != head)
                {
                    temp1 = temp1.next;
                    head = head.next;
                }
                return head;
            }
        }
        return null;
    }
}
