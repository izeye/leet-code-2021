package com.izeye.leetcode2021.problems.problem1;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Tests for {@link Solution}.
 *
 * @author Johnny Lim
 */
class SolutionTests {

	@ParameterizedTest
	@MethodSource("solutions")
	void example1(Solution solution) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(0, 1);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void example2(Solution solution) {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(1, 2);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void example3(Solution solution) {
		int[] nums = { 3, 3 };
		int target = 6;
		assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(0, 1);
	}

	@ParameterizedTest
	@MethodSource("solutions")
	void youMayNotUseTheSameElementTwice(Solution solution) {
		int[] nums = { 2, 5, 5, 11 };
		int target = 10;
		assertThat(solution.twoSum(nums, target)).containsExactlyInAnyOrder(1, 2);
	}

	private static List<Solution> solutions() {
		return Arrays.asList(new MySolution(), new TwoPassHashTableSolution(), new OnePassHashTableSolution());
	}

}
