package com.rajesh.practice.medium.newpack;

import java.util.Stack;

public class DailyTemperatures
{
    public int[] dailyTemperatures(int[] T)
    {
        if (T == null)
        {
            return null;
        }
        if (T.length == 0)
        {
            return new int[0];
        }

        int[] res = new int[T.length];
        Stack<Integer> st = new Stack<Integer>();
        res[T.length - 1] = 0;
        st.push(T.length - 1);

        for (int i = T.length - 2; i >= 0; i--)
        {
            while (!st.isEmpty() && T[i] >= T[st.peek()])
            {
                st.pop();
            }

            if (!st.isEmpty())
            {
                res[i] = st.peek() - i;
            }
            st.push(i);
        }
        return res;
    }
}
