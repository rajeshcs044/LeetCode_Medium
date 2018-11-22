package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.List;

public class Subsets
{
    public static List<List<Integer>> subsets(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        result.add(new ArrayList<Integer>());

        for (int i = 0; i < nums.length; i++)
        {
            int n = result.size();
            for (int j = 0; j < n; j++)
            {
                List<Integer> newList = new ArrayList<>(result.get(j));
                newList.add(nums[i]);
                result.add(newList);
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3 };
        int[] B = { 1, 2, 3, 4 };
        List<List<Integer>> result = subsets(A);

        System.out.println("Result: " + result); //$NON-NLS-1$
    }
}
