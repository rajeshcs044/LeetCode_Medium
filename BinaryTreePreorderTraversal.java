package com.rajesh.practice.medium.newpack;

import java.util.ArrayList;
import java.util.List;

import com.rajesh.practice.medium.TreeNode;

public class BinaryTreePreorderTraversal
{
    List<Integer> preorderList = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root)
    {
        preorder(root);
        return preorderList;
    }

    public void preorder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        preorderList.add(root.val);
        preorder(root.left);
        preorder(root.right);
    }
}
