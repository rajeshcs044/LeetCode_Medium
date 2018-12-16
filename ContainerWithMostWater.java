package com.rajesh.practice.medium.newpack;

public class ContainerWithMostWater
{
    public int maxArea(int[] height)
    {
        int length = height.length;
        if (length == 0 || length == 1)
        {
            return 0;
        }
        int result = 0;
        int i = 0;
        int j = length - 1;
        while (j > i)
        {
            if (height[i] > height[j])
            {
                int storage = height[j] * (j - i);
                result = storage > result ? storage : result;
                j--;
            }
            else
            {
                int storage = height[i] * (j - i);
                result = storage > result ? storage : result;
                i++;
            }
        }

        return result;
    }
}
