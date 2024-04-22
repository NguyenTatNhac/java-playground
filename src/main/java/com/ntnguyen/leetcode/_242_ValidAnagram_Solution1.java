package com.ntnguyen.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class _242_ValidAnagram_Solution1 {

    public static void main(String[] args) {
        String s = "aacc", t = "ccac";
        _242_ValidAnagram_Solution1 o = new _242_ValidAnagram_Solution1();
        System.out.println(o.isAnagram(s, t));
    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> sCharCount = new HashMap<>();
        for (char c : s.toCharArray()) {
            sCharCount.compute(c, (character, appearCount) -> appearCount == null ? 1 : appearCount + 1);
        }
        System.out.println(sCharCount);

        Map<Character, Integer> tExtraCharCount = new HashMap<>();
        for (char c : t.toCharArray()) {
            if (sCharCount.containsKey(c)) {
                if (sCharCount.get(c) > 1) {
                    tExtraCharCount.compute(c, (character, appearCount) -> appearCount == null ? 1 : appearCount + 1);
                }
            } else {
                return false;
            }
        }
        System.out.println(tExtraCharCount);

        for (Map.Entry<Character, Integer> entry : tExtraCharCount.entrySet()) {
            if (!Objects.equals(entry.getValue(), sCharCount.get(entry.getKey()))) {
                return false;
            }
        }

        return true;
    }
}
