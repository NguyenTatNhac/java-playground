package com.ntnguyen.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class _271_ContainsDuplicate_Solution1 {

    public static void main(String[] args) {
        _271_ContainsDuplicate_Solution1 object = new _271_ContainsDuplicate_Solution1();

        int[] nums = {2, 3, 5, 6};
        System.out.println(object.containsDuplicate(nums));
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        return set.size() != nums.length;
    }
}
