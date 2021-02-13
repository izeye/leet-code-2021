package com.izeye.leetcode2021.problems.problem4;

/**
 * Solution for "4. Median of Two Sorted Arrays".
 *
 * See https://leetcode.com/problems/median-of-two-sorted-arrays/
 *
 * @author Johnny Lim
 */
class Solution {

	double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int[] merged = merge(nums1, nums2);
		return findMedian(merged);
	}

	private int[] merge(int[] nums1, int[] nums2) {
		int[] merged = new int[nums1.length + nums2.length];
		int i1 = 0;
		int i2 = 0;
		for (int i = 0; i < merged.length; i++) {
			if (i1 == nums1.length) {
				System.arraycopy(nums2, i2, merged, i, nums2.length - i2);
				break;
			}
			if (i2 == nums2.length) {
				System.arraycopy(nums1, i1, merged, i, nums1.length - i1);
				break;
			}
			if (nums1[i1] < nums2[i2]) {
				merged[i] = nums1[i1++];
			}
			else {
				merged[i] = nums2[i2++];
			}
		}
		return merged;
	}

	private double findMedian(int[] nums) {
		int length = nums.length;
		int middle = length / 2;
		if (length % 2 == 0) {
			return (nums[middle - 1] + nums[middle]) / 2d;
		}
		else {
			return nums[middle];
		}
	}

}
