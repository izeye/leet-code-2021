package com.izeye.leetcode2021.problems.problem1;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution from "Approach 3: One-pass Hash Table".
 *
 * @author Johnny Lim
 */
public class OnePassHashTableSolution implements Solution {

	@Override
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int num = nums[i];
			int complement = target - num;
			Integer complementIndex = map.get(complement);
			if (complementIndex != null) {
				return new int[] { i, complementIndex };
			}
			map.put(num, i);
		}
		throw new IllegalArgumentException("Invalid input.");
	}

}
