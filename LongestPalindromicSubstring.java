package com.rajesh.practice.medium;

public class LongestPalindromicSubstring
{
    public static String longestPalindrome(String s)
    {
        if (s == null)
        {
            return null;
        }

        if (s.length() == 0)
        {
            return "";
        }

        char[] charArray = s.toCharArray();
        int globalI = 0, globalJ = 0;
        for (int i = 0; i < charArray.length; i++)
        {
            int j = i - 1;
            int k = i + 1;
            boolean flag = false;
            while (j >= 0 && k < charArray.length)
            {
                flag = true;
                if (charArray[j] != charArray[k])
                {
                    j = j + 1;
                    k = k - 1;
                    if ((globalJ - globalI) < (k - j))
                    {
                        globalI = j;
                        globalJ = k;
                    }
                    break;
                }
                j--;
                k++;
            }
            if ((j == -1 || k == charArray.length) && flag)
            {
                j = j + 1;
                k = k - 1;
                if ((globalJ - globalI) < (k - j))
                {
                    globalI = j;
                    globalJ = k;
                }
            }
        }
        for (int i = 0; i < charArray.length; i++)
        {
            int j = i;
            int k = i + 1;
            boolean flag = false;
            while (j >= 0 && k < charArray.length)
            {
                flag = true;
                if (charArray[j] != charArray[k])
                {
                    j = j + 1;
                    k = k - 1;
                    if ((globalJ - globalI) < (k - j))
                    {
                        globalI = j;
                        globalJ = k;
                    }
                    break;
                }
                j--;
                k++;
            }
            if ((j == -1 || k == charArray.length) && flag)
            {
                j = j + 1;
                k = k - 1;
                if ((globalJ - globalI) < (k - j))
                {
                    globalI = j;
                    globalJ = k;
                }
            }
        }
        return s.substring(globalI, globalJ + 1);
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + longestPalindrome("abcda"));
    }
}
