package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode
{
    public List<Integer> grayCode(int n)
    {
        List<Integer> result = new ArrayList<>();
        // 1 << n -> 2 power n. i >> 1 -> i/2.
        for (int i = 0; i < 1 << n; i++)
        {
            result.add(i ^ i >> 1);
        }
        return result;
    }

    public static void main(String[] args)
    {
        int a = 3;
        for (int i = 0; i < 1 << a; i++)
        {
            System.out.println(1 << a);
        }
    }
}
