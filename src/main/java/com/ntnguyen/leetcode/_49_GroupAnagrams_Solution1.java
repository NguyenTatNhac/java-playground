package com.ntnguyen.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class _49_GroupAnagrams_Solution1 {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> groups = new HashMap<>();

        for (String s : strs) {
            char[] sorted = s.toCharArray();
            Arrays.sort(sorted);
            String sortedString = new String(sorted);

            if (groups.containsKey(sortedString)) {
                groups.get(sortedString).add(s);
            } else {
                groups.put(sortedString, new ArrayList<>(List.of(s)));
            }
        }

        return new ArrayList<>(groups.values());
    }
}
