package com.izeye.leetcode2021.problems.problem5;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
class SolutionTests {

	private final Solution solution = new Solution();

	@Test
	void example1() {
		String s = "babad";
		assertThat(this.solution.longestPalindrome(s)).isEqualTo("bab");
	}

	@Test
	void example2() {
		String s = "cbbd";
		assertThat(this.solution.longestPalindrome(s)).isEqualTo("bb");
	}

	@Test
	void example3() {
		String s = "a";
		assertThat(this.solution.longestPalindrome(s)).isEqualTo("a");
	}

	@Test
	void example4() {
		String s = "ac";
		assertThat(this.solution.longestPalindrome(s)).isEqualTo("a");
	}

	@Test
	void palindrome() {
		String s = "abcba";
		assertThat(this.solution.longestPalindrome(s)).isEqualTo("abcba");
	}

}
