package com.rajesh.practice.medium;

import java.util.HashMap;
import java.util.Map;

public class EncodeAndDecodeTinyURL
{

    Map<String, String> url = new HashMap<String, String>();

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl)
    {
        String encodeString = "http://tinyurl.com/" + Math.random();
        url.put(encodeString, longUrl);
        return encodeString;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl)
    {
        return url.get(shortUrl);
    }

    public static void main(String[] args)
    {
        System.out.println("Output: " + new EncodeAndDecodeTinyURL().encode("abc"));
    }
}
