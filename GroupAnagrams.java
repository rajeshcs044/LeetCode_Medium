package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams
{
    public List<List<String>> groupAnagrams(String[] strs)
    {
        Map<String, List<String>> groups = new HashMap<String, List<String>>();
        for (String str : strs)
        {
            char[] a = str.toCharArray();
            Arrays.sort(a);
            String string = new String(a);

            if (groups.containsKey(string))
            {
                List<String> stringList = groups.get(string);
                stringList.add(str);
                groups.put(string, stringList);
            }
            else
            {
                List<String> stringList = new ArrayList<>();
                stringList.add(str);
                groups.put(string, stringList);
            }
        }

        List<List<String>> result = new ArrayList<List<String>>();
        for (Map.Entry<String, List<String>> entry : groups.entrySet())
        {
            result.add(entry.getValue());
        }
        return result;
    }
}
