package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BinaryTreeLevelOrderTraversal
{
    public List<List<Integer>> levelOrder(TreeNode root)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if (root == null)
        {
            return result;
        }

        LinkedList<TreeNode> que1 = new LinkedList<>();
        LinkedList<TreeNode> que2 = new LinkedList<>();

        que1.add(root);
        List<Integer> subList = new ArrayList<>();
        boolean flag = false;
        while (!que1.isEmpty() || !que2.isEmpty())
        {
            if (!que1.isEmpty() && !flag)
            {
                TreeNode currentNode = que1.remove();
                subList.add(currentNode.val);
                if (que1.isEmpty())
                {
                    result.add(subList);
                    subList = new ArrayList<>();
                    flag = true;
                }
                if (currentNode.left != null)
                {
                    que2.add(currentNode.left);
                }
                if (currentNode.right != null)
                {
                    que2.add(currentNode.right);
                }
            }

            if (!que2.isEmpty() && flag)
            {
                TreeNode currentNode = que2.remove();
                subList.add(currentNode.val);
                if (que2.isEmpty())
                {
                    result.add(subList);
                    subList = new ArrayList<>();
                    flag = false;
                }
                if (currentNode.left != null)
                {
                    que1.add(currentNode.left);
                }
                if (currentNode.right != null)
                {
                    que1.add(currentNode.right);
                }
            }
        }
        return result;
    }
}
