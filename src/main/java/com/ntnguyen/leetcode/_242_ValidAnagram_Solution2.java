package com.ntnguyen.leetcode;

import java.util.Arrays;

public class _242_ValidAnagram_Solution2 {

    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        _242_ValidAnagram_Solution2 o = new _242_ValidAnagram_Solution2();
        System.out.println(o.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        char[] sChars = s.toCharArray();
        Arrays.sort(sChars);

        char[] tChars = t.toCharArray();
        Arrays.sort(tChars);

        return Arrays.equals(sChars, tChars);
    }
}
