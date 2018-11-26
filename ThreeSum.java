package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum
{
    public static List<List<Integer>> threeSum(int[] nums)
    {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 2; i++)
        {
            if (i > 0 && nums[i] == nums[i - 1])
            {
                continue;
            }

            int j = i + 1;
            int k = n - 1;
            int target = -nums[i];
            while (j < k)
            {
                if (target == (nums[j] + nums[k]))
                {
                    result.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;
                    k--;
                    while (j < k && nums[j] == nums[j - 1])
                    {
                        j++;
                    }
                    while (j < k && nums[k] == nums[k + 1])
                    {
                        k--;
                    }
                }
                else if (target > nums[j] + nums[k])
                {
                    j++;
                }
                else
                {
                    k--;
                }
            }
        }
        return result;
    }

    public static void main(String[] args)
    {
        int A[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println("Result: " + threeSum(A));
    }
}
