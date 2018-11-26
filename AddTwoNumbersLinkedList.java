package com.rajesh.practice.medium;

import com.rajesh.practice.easy.ListNode;

public class AddTwoNumbersLinkedList
{
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2)
    {
        if (l1 == null & l2 == null)
        {
            return null;
        }

        int carry = 0;
        ListNode result = null;
        ListNode temp = null;

        while (l1 != null || l2 != null)
        {
            if (l1 == null)
            {
                if (result == null)
                {
                    result = new ListNode(l2.val);
                    temp = result;
                    result.next = l2.next;
                }
                else
                {
                    int val = l2.val + carry;
                    while (val > 9)
                    {
                        result.next = new ListNode(val % 10);
                        result = result.next;
                        if (l2.next == null)
                        {
                            result.next = new ListNode(1);
                            return temp;
                        }
                        val = l2.next.val + carry;
                        l2 = l2.next;
                    }
                    result.next = new ListNode(val);
                    result.next.next = l2.next;
                }
                return temp;
            }
            if (l2 == null)
            {
                if (result == null)
                {
                    result = new ListNode(l1.val);
                    temp = result;
                    result.next = l1.next;
                }
                else
                {
                    int val = l1.val + carry;
                    while (val > 9)
                    {
                        result.next = new ListNode(val % 10);
                        result = result.next;
                        if (l1.next == null)
                        {
                            result.next = new ListNode(1);
                            return temp;
                        }
                        val = l1.next.val + carry;
                        l1 = l1.next;
                    }
                    result.next = new ListNode(val);
                    result.next.next = l1.next;
                }
                return temp;
            }
            int value = l1.val + l2.val + carry;
            if (value > 9)
            {
                if (result == null)
                {
                    result = new ListNode(value % 10);
                    temp = result;
                }
                else
                {
                    result.next = new ListNode(value % 10);
                    result = result.next;
                }
                carry = 1;
            }
            else
            {
                if (result == null)
                {
                    result = new ListNode(value);
                    temp = result;
                }
                else
                {
                    result.next = new ListNode(value);
                    result = result.next;
                }
                carry = 0;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (carry == 1)
        {
            result.next = new ListNode(1);
        }
        return temp;
    }

    public static void main(String[] args)
    {
        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(9);
        ListNode l3 = new ListNode(9);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(9);
        ListNode l6 = new ListNode(4);
        l1.next = l2;
        l2.next = l3;
        // l4.next = l5;
        // l5.next = l6;
        System.out.println("Result: " + addTwoNumbers(l1, l4));
    }
}
