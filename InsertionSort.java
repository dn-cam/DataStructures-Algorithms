/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class InsertionSort {
	
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

	public ListNode insertionSortList(ListNode head) {

		if (head == null || head.next == null) {
			return head;
		}

		ListNode sorted = new ListNode(0);
		ListNode pre, curr, next;
		curr = head;

		while (curr != null) {

			next = curr.next;
			pre = sorted;

			while (pre.next != null && pre.next.val < curr.val)
				pre = pre.next;

			curr.next = pre.next;
			pre.next = curr;

			curr = next;

		}

		return sorted.next;
	}

}
