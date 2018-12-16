package com.rajesh.practice.medium.newpack;

import java.util.ArrayList;
import java.util.List;

import com.rajesh.practice.medium.TreeNode;

public class BinaryTreeInorderTraversal
{
    List<Integer> inorderList = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root)
    {
        inorder(root);
        return inorderList;
    }

    public void inorder(TreeNode root)
    {
        if (root == null)
        {
            return;
        }
        inorder(root.left);
        inorderList.add(root.val);
        inorder(root.right);
    }
}
