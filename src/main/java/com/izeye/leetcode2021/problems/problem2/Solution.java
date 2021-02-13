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
		while (true) {
			int result = addDigits(current, l1, l2);
			if (result > 9) {
				current.next = new ListNode(1);
			}
			current.val = result % 10;

			if (l1 != null) {
				l1 = l1.next;
			}
			if (l2 != null) {
				l2 = l2.next;
			}

			if (l1 == null && l2 == null) {
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
