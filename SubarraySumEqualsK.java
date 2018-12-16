package com.rajesh.practice.medium.newpack;

import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK
{
    public int subarraySum(int[] nums, int k)
    {
        int result = 0;
        Map<Integer, Integer> preSumFreq = new HashMap<Integer, Integer>();
        preSumFreq.put(0, 1);
        int total = 0;
        for (int i = 0; i < nums.length; i++)
        {
            total = total + nums[i];
            result = result + preSumFreq.getOrDefault(total - k, 0);
            preSumFreq.put(total, preSumFreq.getOrDefault(total, 0) + 1);
        }
        return result;
    }
}
