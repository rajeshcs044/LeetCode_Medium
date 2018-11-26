package com.rajesh.practice.medium;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters
{
    public static int lengthOfLongestSubstring(String s)
    {
        int count = 0;
        Set<Character> uniqueCh = new HashSet<Character>();
        char[] ch = s.toCharArray();
        int temp = 0;
        int k = 0;
        for (int i = 0; i < ch.length; i++)
        {
            if (!uniqueCh.contains(ch[i]))
            {
                uniqueCh.add(ch[i]);
                if (count < i - temp + 1)
                {
                    count = i - temp + 1;
                }
            }
            else
            {
                while (k <= i)
                {
                    if (ch[i] == ch[k])
                    {
                        k++;
                        temp = k;
                        break;
                    }
                    uniqueCh.remove(ch[k]);
                    k++;
                }
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + lengthOfLongestSubstring(""));
    }
}
