package com.izeye.leetcode2021.problems.problem3;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link MySolution}.
 *
 * @author Johnny Lim
 */
class SolutionTests {

	@ParameterizedTest
	@MethodSource("solutions")
	void example1(Solution solution) {
		String s = "abcabcbb";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(3);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void example2(Solution solution) {
		String s = "bbbbb";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(1);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void example3(Solution solution) {
		String s = "pwwkew";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(3);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void example4(Solution solution) {
		String s = "";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(0);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void failed1(Solution solution) {
		String s = " ";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(1);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void failed2(Solution solution) {
		String s = "tmmzuxt";
		assertThat(solution.lengthOfLongestSubstring(s)).isEqualTo(5);
	}

	private static List<Solution> solutions() {
		return Arrays.asList(new MySolution(), new SlidingWindowSolution(), new SlidingWindowOptimizedHashMapSolution(),
				new SlidingWindowOptimizedAscii128Solution());
	}

}
