package com.izeye.leetcode2021.problems.problem3;

import java.util.HashMap;
import java.util.Map;

/**
 * Solution from "Approach 3: Sliding Window Optimized - Using HashMap".
 *
 * @author Johnny Lim
 */
public class SlidingWindowOptimizedHashMapSolution implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int max = 0;

		int i = 0;
		Map<Character, Integer> map = new HashMap<>();
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			Integer index = map.get(c);
			if (index != null) {
				i = Math.max(i, index + 1);
			}
			max = Math.max(max, j - i + 1);
			map.put(c, j);
		}
		return max;
	}

}
