package com.rajesh.practice.medium;

public class ProductOfArrayExceptSelf
{
    public static int[] productExceptSelf(int[] nums)
    {
        int[] leftPdt = new int[nums.length];
        int[] rightPdt = new int[nums.length];
        int totProduct = 1;
        for (int i = 0; i < nums.length - 1; i++)
        {
            leftPdt[i + 1] = totProduct * nums[i];
        }

        leftPdt[0] = 1;
        for (int i = 0; i < nums.length - 1; i++)
        {
            leftPdt[i + 1] = leftPdt[i] * nums[i];
        }

        rightPdt[nums.length - 1] = 1;
        for (int i = nums.length - 1; i > 0; i--)
        {
            rightPdt[i - 1] = rightPdt[i] * nums[i];
        }

        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            result[i] = leftPdt[i] * rightPdt[i];
        }

        return result;
    }

    public static void main(String[] args)
    {
        int[] A = { 1, 2, 3, 4 };
        System.out.println("Result: " + productExceptSelf(A));
    }
}
