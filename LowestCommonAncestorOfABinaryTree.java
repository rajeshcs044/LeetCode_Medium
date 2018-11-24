package com.rajesh.practice.medium;

import java.util.Stack;

public class LowestCommonAncestorOfABinaryTree
{
    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q)
    {
        Stack<TreeNode> st1 = new Stack();
        Stack<TreeNode> st2 = new Stack();

        findPathFromRootToNode(root, p, st1);
        findPathFromRootToNode(root, q, st2);

        TreeNode result = null;
        while (!st1.isEmpty() && !st2.isEmpty())
        {
            if (st1.peek().val != st2.peek().val)
            {
                return result;
            }
            result = st1.pop();
            st2.pop();
        }
        return result;
    }

    public static boolean findPathFromRootToNode(TreeNode root, TreeNode n, Stack st)
    {
        if (root == null || n == null)
        {
            return false;
        }

        if (root.val == n.val)
        {
            st.push(root);
            return true;
        }
        else
        {
            if (findPathFromRootToNode(root.left, n, st))
            {
                st.push(root);
                return true;
            }
            else if (findPathFromRootToNode(root.right, n, st))
            {
                st.push(root);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(5);
        TreeNode t3 = new TreeNode(1);
        TreeNode t4 = new TreeNode(6);
        TreeNode t5 = new TreeNode(2);
        TreeNode t6 = new TreeNode(0);
        TreeNode t7 = new TreeNode(8);
        TreeNode t8 = new TreeNode(7);
        TreeNode t9 = new TreeNode(4);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;
        t3.left = t6;
        t3.right = t7;
        t5.left = t8;
        t5.right = t9;
        lowestCommonAncestor(t1, t8, t7);
    }
}
