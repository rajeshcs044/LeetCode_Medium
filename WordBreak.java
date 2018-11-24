package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.List;

public class WordBreak
{
    public static boolean wordBreak(String s, List<String> wordDict)
    {
        // Simple solution - inefficient.
        /*if (s.length() == 0)
        {
            return true;
        }
        for (int i = 1; i <= s.length(); i++)
        {
            if (wordDict.contains(s.substring(0, i)) && wordBreak(s.substring(i, s.length()), wordDict))
            {
                return true;
            }
        }
        return false;*/

        //using dp
        int n = s.length();
        boolean[] bool = new boolean[n];
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j <= i; j++)
            {
                String sub = s.substring(j, i + 1);
                if (wordDict.contains(sub) && (j == 0 || bool[j - 1]))
                {
                    bool[i] = true;
                    break;
                }
            }
        }
        return bool[n - 1];
    }

    public static void main(String[] args)
    {
        List<String> str = new ArrayList<>();
        str.add("a");
        str.add("aa");
        str.add("aaa");
        str.add("aaaa");
        str.add("aaaaa");
        str.add("aaaaaa");
        str.add("aaaaaaa");
        str.add("aaaaaaa");
        str.add("aaaaaaa");
        str.add("aaaaaaa");
        System.out.println("Result: " + wordBreak(
                "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa",
                str));
    }
}
