package com.rajesh.practice.medium.newpack;

import com.rajesh.practice.medium.TreeNode;

public class KthSmallestElementInABST
{
    int count = 0;
    int result = -1;

    public int kthSmallest(TreeNode root, int k)
    {
        if (root == null)
        {

        }
        inorder(root, k);
        return result;
    }

    private void inorder(TreeNode root, int k)
    {
        if (root == null)
        {
            return;
        }

        inorder(root.left, k);
        count++;
        if (count == k)
        {
            result = root.val;
        }
        inorder(root.right, k);
    }
}
