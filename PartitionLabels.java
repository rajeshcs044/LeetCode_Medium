package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PartitionLabels
{
    public static List<Integer> partitionLabels(String S)
    {
        int[] table = new int[26];
        List<Integer> count = new ArrayList<Integer>();
        Set<Character> characters = new HashSet<Character>();
        char[] charArray = S.toCharArray();
        for (char c : charArray)
        {
            table[c - 'a']++;
        }

        int counter = 0;
        int j = 0;
        for (int i = 0; i < charArray.length; i++)
        {
            table[charArray[i] - 'a']--;
            if (!characters.contains(charArray[i]))
            {
                characters.add(charArray[i]);
                counter++;
            }

            if (table[charArray[i] - 'a'] == 0)
            {
                characters.remove(charArray[i]);
                counter--;
            }

            if (counter == 0)
            {
                count.add(i - j + 1);
                j = i + 1;
            }
        }
        return count;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + partitionLabels("ababcbacadefegdehijhklij"));
    }
}
