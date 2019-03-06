/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 * problem statement: https://leetcode.com/problems/reverse-linked-list/
 */
public class ReverseList {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode reverseList(ListNode head) {

		if (head == null || head.next == null)
			return head;

		ListNode curr = head;
		ListNode prev = null;

		while (curr != null) {
			ListNode temp = curr.next;
			curr.next = prev;
			prev = curr;
			curr = temp;

		}
		return prev;
	}

}
