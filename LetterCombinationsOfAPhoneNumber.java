package com.rajesh.practice.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfAPhoneNumber
{
    public static List<String> letterCombinations(String digits)
    {
        Map<Character, List<String>> characters = new HashMap<Character, List<String>>();
        List<String> a = new ArrayList<String>();
        a.add("a");
        a.add("b");
        a.add("c");
        characters.put('2', a);
        List<String> b = new ArrayList<String>();
        b.add("d");
        b.add("e");
        b.add("f");
        characters.put('3', b);
        List<String> c = new ArrayList<String>();
        c.add("g");
        c.add("h");
        c.add("i");
        characters.put('4', c);
        List<String> d = new ArrayList<String>();
        d.add("j");
        d.add("k");
        d.add("l");
        characters.put('5', d);
        List<String> e = new ArrayList<String>();
        e.add("m");
        e.add("n");
        e.add("o");
        characters.put('6', e);
        List<String> f = new ArrayList<String>();
        f.add("p");
        f.add("q");
        f.add("r");
        f.add("s");
        characters.put('7', f);
        List<String> g = new ArrayList<String>();
        g.add("t");
        g.add("u");
        g.add("v");
        characters.put('8', g);
        List<String> h = new ArrayList<String>();
        h.add("w");
        h.add("x");
        h.add("y");
        h.add("z");
        characters.put('9', h);

        char[] ch = digits.toCharArray();
        if (ch.length == 0)
        {
            return new ArrayList<>();
        }

        List<String> finalResult = new ArrayList<String>();
        List<String> result = new ArrayList<String>();
        List<String> temp = new ArrayList<String>();
        temp.addAll(characters.get(ch[0]));
        if (ch.length == 1)
        {
            return temp;
        }
        for (int i = 1; i < ch.length; i++)
        {
            for (String str : temp)
            {
                for (String s : characters.get(ch[i]))
                {
                    result.add(str + s);
                    if (i == ch.length - 1)
                    {
                        finalResult.add(str + s);
                    }
                }
            }
            temp = new ArrayList<>(result);
            result = new ArrayList<>();
        }
        return finalResult;
    }

    public static void main(String[] args)
    {
        System.out.println("Result: " + letterCombinations("5678"));
    }
}
