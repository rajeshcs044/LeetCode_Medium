package com.rajesh.practice.medium.newpack;

import com.rajesh.practice.easy.ListNode;

public class RemoveNthNodeFromEndOfList
{
    public ListNode removeNthFromEnd(ListNode head, int n)
    {
        if (head == null)
        {
            return null;
        }
        ListNode temp = head;
        ListNode temp1 = null;
        int count = 0;
        while (head != null)
        {
            if (temp1 != null)
            {
                temp1 = temp1.next;
            }
            if (count == n)
            {
                temp1 = temp;
            }
            count++;
            head = head.next;
        }

        if (temp1 == null)
        {
            return temp.next;
        }
        temp1.next = temp1.next.next;
        return temp;
    }
}
