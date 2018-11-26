package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class WordLadder
{
    public static int ladderLength(String beginWord, String endWord, List<String> wordList)
    {
        Set<String> wordSet = new HashSet<String>(wordList);
        if (!wordSet.contains(endWord) || beginWord.length() != endWord.length())
        {
            return 0;
        }
        Queue<String> queue = new LinkedList<String>();
        int result = 1;
        queue.add(beginWord);
        while (!queue.isEmpty())
        {
            int size = queue.size();
            for (int i = 0; i < size; i++)
            {
                String current = queue.remove();
                if (current.equals(endWord))
                {
                    return result;
                }
                for (int j = 0; j < current.length(); j++)
                {
                    char[] ch = current.toCharArray();
                    for (char c = 'a'; c <= 'z'; c++)
                    {
                        ch[j] = c;
                        String s = new String(ch);
                        if (!s.equals(current) && wordSet.contains(s))
                        {
                            queue.add(s);
                            wordSet.remove(s);
                        }
                    }
                }
            }
            result++;
        }
        return 0;
    }

    public static void main(String[] args)
    {
        List<String> wordList = new ArrayList<>();
        wordList.add("most");
        wordList.add("fist");
        wordList.add("lost");
        wordList.add("cost");
        wordList.add("fish");
        ladderLength("lost", "cost", wordList);
    }
}
