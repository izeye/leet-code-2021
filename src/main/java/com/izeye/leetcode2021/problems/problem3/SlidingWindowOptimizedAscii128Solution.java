package com.izeye.leetcode2021.problems.problem3;

/**
 * Solution from "Approach 3: Sliding Window Optimized - Assuming ASCII 128".
 *
 * @author Johnny Lim
 */
public class SlidingWindowOptimizedAscii128Solution implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int max = 0;

		int i = 0;
		int[] index = new int[128];
		for (int j = 0; j < s.length(); j++) {
			char c = s.charAt(j);
			i = Math.max(i, index[c]);
			max = Math.max(max, j - i + 1);
			// This exploits default initial values for 'index' array, so 'j' alone won't
			// work.
			index[c] = j + 1;
		}
		return max;
	}

}
