package com.ntnguyen.leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements347Solution2 {

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> countingMap = new HashMap<>();
        for (int n : nums) {
            countingMap.put(n, countingMap.getOrDefault(n, 0) + 1);
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a, b) -> countingMap.get(b) - countingMap.get(a));
        for (int key : countingMap.keySet()) {
            maxHeap.add(key);
        }

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll();
        }

        return result;
    }
}
