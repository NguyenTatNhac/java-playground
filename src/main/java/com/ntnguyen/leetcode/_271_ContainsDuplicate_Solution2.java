package com.ntnguyen.leetcode;

import java.util.HashSet;
import java.util.Set;

public class _271_ContainsDuplicate_Solution2 {

    public static void main(String[] args) {
        _271_ContainsDuplicate_Solution2 object = new _271_ContainsDuplicate_Solution2();

        int[] nums = {2, 3, 5, 6};
        System.out.println(object.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            } else {
                set.add(num);
            }
        }
        return false;
    }
}
