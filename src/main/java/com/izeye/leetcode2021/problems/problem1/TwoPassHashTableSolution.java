package com.izeye.leetcode2021.problems.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution from "Approach 2: Two-pass Hash Table".
 *
 * @author Johnny Lim
 */
public class TwoPassHashTableSolution implements Solution {

	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			Integer complementIndex = map.get(complement);
			if (complementIndex != null && complementIndex != i) {
				return new int[] { i, complementIndex };
			}
		}
		throw new IllegalArgumentException("Invalid input.");
	}

}
