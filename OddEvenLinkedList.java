/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 * problem statement: https://leetcode.com/problems/odd-even-linked-list/
 */
public class OddEvenLinkedList {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode oddEvenList(ListNode head) {
		ListNode odd = new ListNode(1);
		ListNode evenHead = new ListNode(2);
		ListNode curr = new ListNode(0);
		ListNode even = new ListNode(0);

		if (head == null || head.next == null || head.next.next == null)
			return head;

		evenHead = head.next;
		curr = evenHead;
		odd = head;

		while (curr != null) {
			even = curr;
			odd.next = even.next;
			if (odd.next == null)
				break;
			else {
				odd = odd.next;
				even.next = odd.next;
				curr = odd.next;
			}
		}
		odd.next = evenHead;
		return head;

	}

}
