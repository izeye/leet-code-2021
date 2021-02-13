package com.izeye.leetcode2021.problems.problem1;

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
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;
		assertThat(this.solution.twoSum(nums, target)).containsExactlyInAnyOrder(0, 1);
	}

	@Test
	void example2() {
		int[] nums = { 3, 2, 4 };
		int target = 6;
		assertThat(this.solution.twoSum(nums, target)).containsExactlyInAnyOrder(1, 2);
	}

	@Test
	void example3() {
		int[] nums = { 3, 3 };
		int target = 6;
		assertThat(this.solution.twoSum(nums, target)).containsExactlyInAnyOrder(0, 1);
	}

	@Test
	void youMayNotUseTheSameElementTwice() {
		int[] nums = { 2, 5, 5, 11 };
		int target = 10;
		assertThat(this.solution.twoSum(nums, target)).containsExactlyInAnyOrder(1, 2);
	}

}
