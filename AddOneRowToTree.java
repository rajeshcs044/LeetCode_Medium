package com.rajesh.practice.medium.newpack;

import java.util.LinkedList;
import java.util.Queue;

import com.rajesh.practice.medium.TreeNode;

public class AddOneRowToTree
{
    public TreeNode addOneRow(TreeNode root, int v, int d)
    {
        if (d == 1)
        {
            TreeNode newNode = new TreeNode(v);
            newNode.left = root;
            return newNode;
        }
        if (root == null)
        {
            return null;
        }
        Queue<TreeNode> q = new LinkedList<TreeNode>();
        q.add(root);
        int depth = 1;
        while (!q.isEmpty())
        {
            depth++;
            int size = q.size();
            for (int i = 0; i < size; i++)
            {
                TreeNode temp = q.remove();
                if (d == depth)
                {
                    TreeNode leftNode = new TreeNode(v);
                    leftNode.left = temp.left;
                    temp.left = leftNode;

                    TreeNode rightNode = new TreeNode(v);
                    rightNode.right = temp.right;
                    temp.right = rightNode;
                    if (i == size - 1)
                    {
                        return root;
                    }
                }
                if (temp.left != null)
                {
                    q.add(temp.left);
                }
                if (temp.right != null)
                {
                    q.add(temp.right);
                }
            }
        }
        return root;
    }
}
