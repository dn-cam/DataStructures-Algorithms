
/**
 * @author camelliadebnath 06-Mar-2019
 */
public class DeleteNode {

	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}

		public void deleteNode(ListNode node) {
			ListNode x = node.next;
			node.val = x.val;
			node.next = x.next;
			x = null;
	}

}
