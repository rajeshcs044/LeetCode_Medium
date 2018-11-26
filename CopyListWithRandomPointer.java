package com.rajesh.practice.medium;

import java.util.HashMap;
import java.util.Map;

public class CopyListWithRandomPointer
{
    Map<Integer, RandomListNode> visited = new HashMap<>();

    public RandomListNode copyRandomList(RandomListNode head)
    {
        return clone(head);
    }

    public RandomListNode clone(RandomListNode head)
    {
        if (head == null)
        {
            return head;
        }
        if (visited.get(head.label) != null)
        {
            return visited.get(head.label);
        }

        RandomListNode result = new RandomListNode(head.label);
        visited.put(head.label, result);
        result.next = clone(head.next);
        result.random = clone(head.random);

        return result;
    }

    class RandomListNode
    {
        int label;
        RandomListNode next, random;

        RandomListNode(int x)
        {
            this.label = x;
        }
    };
}
