package com.izeye.leetcode2021.problems.problem5;

/**
 * Solution for "5. Longest Palindromic Substring".
 *
 * See https://leetcode.com/problems/longest-palindromic-substring/
 *
 * @author Johnny Lim
 */
class Solution {

	String longestPalindrome(String s) {
		int maxLength = 0;
		String maxPalindrome = null;
		for (int i = 0; i < s.length(); i++) {
			for (int j = s.length(); j > i; j--) {
				int length = j - i;
				if (length > maxLength) {
					String candidate = s.substring(i, j);
					if (isPalindrome(candidate)) {
						maxLength = length;
						maxPalindrome = candidate;
					}
				}
			}
		}
		return maxPalindrome;
	}

	private boolean isPalindrome(String s) {
		int length = s.length();
		for (int i = 0; i < length / 2; i++) {
			if (s.charAt(i) != s.charAt(length - i - 1)) {
				return false;
			}
		}
		return true;
	}

}
