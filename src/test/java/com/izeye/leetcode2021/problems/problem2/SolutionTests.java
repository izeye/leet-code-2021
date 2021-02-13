package com.izeye.leetcode2021.problems.problem2;

import java.util.ArrayList;
import java.util.List;

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
		ListNode l1 = createListNode(2, 4, 3);
		ListNode l2 = createListNode(5, 6, 4);
		printListNode(l1);
		printListNode(l2);

		ListNode output = this.solution.addTwoNumbers(l1, l2);
		printListNode(output);

		assertThat(toList(output)).containsExactly(7, 0, 8);
	}

	private ListNode createListNode(int... digits) {
		ListNode start = new ListNode(digits[0]);
		ListNode current = start;
		for (int i = 1; i < digits.length; i++) {
			ListNode node = new ListNode(digits[i]);
			current.next = node;
			current = node;
		}
		return start;
	}

	private void printListNode(ListNode node) {
		System.out.println(toList(node));
	}

	private List<Integer> toList(ListNode node) {
		List<Integer> list = new ArrayList<>();
		ListNode current = node;
		while (current != null) {
			list.add(current.val);
			current = current.next;
		}
		return list;
	}

	@Test
	void example2() {
		ListNode l1 = createListNode(0);
		ListNode l2 = createListNode(0);
		printListNode(l1);
		printListNode(l2);

		ListNode output = this.solution.addTwoNumbers(l1, l2);
		printListNode(output);

		assertThat(toList(output)).containsExactly(0);
	}

	@Test
	void example3() {
		ListNode l1 = createListNode(9, 9, 9, 9, 9, 9, 9);
		ListNode l2 = createListNode(9, 9, 9, 9);
		printListNode(l1);
		printListNode(l2);

		ListNode output = this.solution.addTwoNumbers(l1, l2);
		printListNode(output);

		assertThat(toList(output)).containsExactly(8, 9, 9, 9, 0, 0, 0, 1);
	}

}
