package com.izeye.leetcode2021.problems.problem3;

import java.util.HashSet;
import java.util.Set;

/**
 * Solution for "3. Longest Substring Without Repeating Characters".
 *
 * See https://leetcode.com/problems/longest-substring-without-repeating-characters/
 *
 * @author Johnny Lim
 */
public class MySolution implements Solution {

	@Override
	public int lengthOfLongestSubstring(String s) {
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			Set<Character> seen = new HashSet<>();
			for (int j = i; j < s.length(); j++) {
				char c = s.charAt(j);
				if (seen.contains(c)) {
					break;
				}
				seen.add(c);
			}
			if (seen.size() > max) {
				max = seen.size();
			}
		}
		return max;
	}

}
