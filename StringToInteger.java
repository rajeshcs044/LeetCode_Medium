package com.rajesh.practice.medium;

public class StringToInteger
{
    public static int myAtoi(String str)
    {
        String s = str.trim();
        if (s == null || s.length() == 0)
        {
            return 0;
        }
        StringBuilder st = new StringBuilder();
        char[] ch = s.toCharArray();
        int k = 0;
        if (ch[0] == '-')
        {
            st.append("-");
            k++;
        }

        if (ch[0] == '+')
        {
            k++;
        }

        for (int i = k; i < ch.length; i++)
        {
            if (ch[i] == '0' || ch[i] == '1' || ch[i] == '2' || ch[i] == '3' || ch[i] == '4' || ch[i] == '5'
                    || ch[i] == '6' || ch[i] == '7' || ch[i] == '8' || ch[i] == '9')
            {
                st.append(ch[i]);
            }
            else
            {
                break;
            }
        }

        if (st.length() == 0)
        {
            return 0;
        }

        boolean isNegative = false;
        if (st.substring(0, 1).equals("-"))
        {
            isNegative = true;
            if (st.length() == 1)
            {
                return 0;
            }
        }
        int a = 0;
        try
        {
            a = Integer.parseInt(st.toString());
        }
        catch (Exception e)
        {
            a = isNegative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return a;
    }

    public static void main(String[] args)
    {
        myAtoi("-");
    }
}
