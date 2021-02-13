package com.izeye.leetcode2021.problems.problem3;

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
		String s = "abcabcbb";
		assertThat(this.solution.lengthOfLongestSubstring(s)).isEqualTo(3);
	}

	@Test
	void example2() {
		String s = "bbbbb";
		assertThat(this.solution.lengthOfLongestSubstring(s)).isEqualTo(1);
	}

	@Test
	void example3() {
		String s = "pwwkew";
		assertThat(this.solution.lengthOfLongestSubstring(s)).isEqualTo(3);
	}

	@Test
	void example4() {
		String s = "";
		assertThat(this.solution.lengthOfLongestSubstring(s)).isEqualTo(0);
	}

	@Test
	void singleCharacter() {
		String s = " ";
		assertThat(this.solution.lengthOfLongestSubstring(s)).isEqualTo(1);
	}

}
