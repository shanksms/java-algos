package Maths;

import java.util.HashMap;
import java.util.Map;

/**
 * TinyURL is a URL shortening service where you enter a URL such as https://leetcode.com/problems/design-tinyurl and it returns a short URL such as http://tinyurl.com/4e9iAk.
 *
 * Design the encode and decode methods for the TinyURL service. There is no restriction on how your encode/decode algorithm should work. You just need to ensure that a URL can be encoded to a tiny URL and the tiny URL can be decoded to the original URL.
 */
public class TinyUrl {
    private char [] cA = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    private Map<String, String> map = new HashMap<>();
    private int count = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        int c = count;
        StringBuilder sb = new StringBuilder();
        while (c > 0) {
            sb.append(cA[c % 62]);
            c = c / 62;
        }

        map.put(sb.reverse().toString(), longUrl);
        count++;
        return sb.reverse().toString();
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return map.get(shortUrl);
    }
}
