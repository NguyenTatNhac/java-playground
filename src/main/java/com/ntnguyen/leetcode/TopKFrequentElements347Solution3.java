package com.ntnguyen.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347Solution3 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countingMap = new HashMap<>();
        for (int n : nums) {
            countingMap.merge(n, 1, Integer::sum);
        }

        List<Integer> frequencyList = new ArrayList<>(countingMap.keySet());
        frequencyList.sort((a, b) -> countingMap.get(b) - countingMap.get(a));

        return frequencyList.stream().limit(k).mapToInt(Integer::intValue).toArray();
    }
}
