package com.rajesh.practice.medium.newpack;

import java.util.Arrays;

public class ThreeSumClosest
{
    public int threeSumClosest(int[] nums, int target)
    {
        int len = nums.length;
        int sum = nums[0] + nums[len - 2] + nums[len - 1];
        int diff = Math.abs(sum - target);
        Arrays.sort(nums);
        for (int i = 0; i < len - 2; i++)
        {
            int j = i + 1;
            int k = len - 1;

            while (j < k)
            {
                int currSum = nums[i] + nums[j] + nums[k];
                int currDiff = Math.abs(target - currSum);

                if (currDiff < diff)
                {
                    diff = currDiff;
                    sum = currSum;
                }

                if (currSum > target)
                {
                    k--;
                }
                else
                {
                    j++;
                }
            }
        }
        return sum;
    }
}
