package com.rajesh.practice.medium.newpack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FourSum
{

    public List<List<Integer>> fourSum(int[] nums, int target)
    {
        int l, r;
        int n = nums.length;

        Set<List<Integer>> result = new HashSet<List<Integer>>();

        Arrays.sort(nums);

        for (int i = 0; i < n - 3; i++)
        {
            for (int j = i + 1; j < n - 2; j++)
            {
                l = j + 1;
                r = n - 1;

                while (l < r)
                {
                    if (nums[i] + nums[j] + nums[l] + nums[r] == target)
                    {
                        result.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));
                        l++;
                        r--;
                    }
                    else if (nums[i] + nums[j] + nums[l] + nums[r] < target)
                        l++;
                    else // A[i] + A[j] + A[l] + A[r] > X
                        r--;
                }
            }
        }
        return new ArrayList<List<Integer>>(result);
    }
}
