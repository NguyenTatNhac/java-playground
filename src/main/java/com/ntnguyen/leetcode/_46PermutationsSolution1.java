package com.ntnguyen.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* Given an array nums of distinct integers, return all the possible permutations.
 * You can return the answer in any order.
 *
 * Example 1:
 * Input: nums = [1,2,3]
 * Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 *
 * Example 2:
 * Input: nums = [0,1]
 * Output: [[0,1],[1,0]]
 *
 * Example 3:
 * Input: nums = [1]
 * Output: [[1]]
 **/
public class _46PermutationsSolution1 {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        List<Integer> initResult = new ArrayList<>();
        List<Integer> remaining = Arrays.stream(nums).boxed().toList();

        backTrack(output, initResult, remaining);

        return output;
    }

    private void backTrack(List<List<Integer>> output, List<Integer> result, List<Integer> remaining) {
        if (remaining.isEmpty()) {
            output.add(result);
            return;
        }

        for (Integer nextNum : remaining) {
            // Clone the original
            List<Integer> newResult = new ArrayList<>(result.stream().toList());
            newResult.add(nextNum);

            List<Integer> newRemaining = remaining.stream().filter(num -> !num.equals(nextNum)).toList();

            backTrack(output, newResult, newRemaining);
        }
    }
}
