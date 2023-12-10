package com.ntnguyen.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequentElements347Solution1 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countingMap = new HashMap<>();
        for (int n : nums) {
            countingMap.put(n, countingMap.getOrDefault(n, 0) + 1);
        }

        List[] bucket = new List[nums.length + 1];
        countingMap.forEach((key, frequency) -> {
            if (bucket[frequency] == null) {
                bucket[frequency] = new ArrayList<>();
            }
            bucket[frequency].add(key);
        });

        List<Integer> result = new ArrayList<>();
        for (int i = bucket.length - 1; i >= 0 && result.size() < k; i--) {
            if (bucket[i] != null) {
                result.addAll(bucket[i]);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
