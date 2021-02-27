package com.izeye.leetcode2021.problems.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution from "Approach 2: Sliding Window".
 *
 * @author Johnny Lim
 */
public class SlidingWindowSolution implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int max = 0;

		int length = s.length();
		int i = 0;
		int j = 0;
		Set<Character> seen = new HashSet<>();
		while (i < length && j < length) {
			char c = s.charAt(j);
			if (!seen.contains(c)) {
				seen.add(c);
				max = Math.max(max, j - i + 1);
				j++;
			}
			else {
				seen.remove(s.charAt(i));
				i++;
			}
		}
		return max;
	}

}
