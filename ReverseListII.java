/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 * problem statement: https://leetcode.com/problems/reverse-linked-list-ii/
 */
public class ReverseListII {
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseBetween(ListNode head, int m, int n) {
		ListNode prev = null;
		ListNode curr = head;
		ListNode tail = new ListNode(0);
		ListNode node_m = new ListNode(0);
		ListNode node_n = new ListNode(0);
		ListNode node_n_nxt = new ListNode(0);

		int i = 0;

		while (i < n) {
			if (i == m - 1) {
				tail = prev;
				node_m = curr;
			}
			prev = curr;
			curr = curr.next;
			i++;
		}
		node_n = prev;
		node_n_nxt = curr;
		node_n.next = null;

		prev = null;
		curr = node_m;
		while (curr != null) {
			ListNode nextemp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextemp;
		}

		if (tail != null) {
			tail.next = node_n;
			node_m.next = node_n_nxt;
		} else {
			head = node_n;
			node_m.next = node_n_nxt;
		}
		return head;
	}

}
