package com.izeye.leetcode2021.problems.problem2;

/**
 * Solution for "2. Add Two Numbers".
 *
 * See https://leetcode.com/problems/add-two-numbers/
 *
 * @author Johnny Lim
 */
class Solution {

	ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode output = new ListNode();

		ListNode current = output;
		ListNode current1 = l1;
		ListNode current2 = l2;
		while (true) {
			int result = addDigits(current, current1, current2);
			if (result > 9) {
				current.next = new ListNode(1);
			}
			current.val = result % 10;

			if (current1 != null) {
				current1 = current1.next;
			}
			if (current2 != null) {
				current2 = current2.next;
			}

			if (current1 == null && current2 == null) {
				break;
			}

			if (current.next == null) {
				current.next = new ListNode();
			}
			current = current.next;
		}
		return output;
	}

	private int addDigits(ListNode... nodes) {
		int result = 0;
		for (ListNode node : nodes) {
			result += (node != null) ? node.val : 0;
		}
		return result;
	}

}
