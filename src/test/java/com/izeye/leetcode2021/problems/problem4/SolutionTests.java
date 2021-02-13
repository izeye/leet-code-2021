package com.izeye.leetcode2021.problems.problem4;

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
		int[] nums1 = { 1, 3 };
		int[] nums2 = { 2 };
		assertThat(this.solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(2d);
	}

	@Test
	void example2() {
		int[] nums1 = { 1, 2 };
		int[] nums2 = { 3, 4 };
		assertThat(this.solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(2.5d);
	}

	@Test
	void example3() {
		int[] nums1 = { 0, 0 };
		int[] nums2 = { 0, 0 };
		assertThat(this.solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(0d);
	}

	@Test
	void example4() {
		int[] nums1 = {};
		int[] nums2 = { 1 };
		assertThat(this.solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(1d);
	}

	@Test
	void example5() {
		int[] nums1 = { 2 };
		int[] nums2 = {};
		assertThat(this.solution.findMedianSortedArrays(nums1, nums2)).isEqualTo(2d);
	}

}
