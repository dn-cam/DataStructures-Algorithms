/**
 * 
 */
import java.util.*;
/**
 * @author camelliadebnath 06-Mar-2019
 * problem statement: https://leetcode.com/problems/subtree-of-another-tree/
 */
public class SubTree {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

		public static void inOrder(TreeNode root, List<Integer> tracker) {

			if (root == null)
				return;

			inOrder(root.left, tracker);
			tracker.add(root.val);
			inOrder(root.right, tracker);

		}

		public boolean isSubtree(TreeNode s, TreeNode t) {

			if (s.left == null && s.right == null && t.left == null && t.right == null)
				return s.val == t.val ? true : false;

			List<Integer> trackBig = new ArrayList<Integer>();
			List<Integer> trackSmol = new ArrayList<Integer>();
			inOrder(s, trackBig);
			inOrder(t, trackSmol);
			boolean flag;

			for (int i = 0; i < trackBig.size(); i++) {
				System.out.println(trackBig.get(i));
			}

			System.out.println("Smol");
			for (int p = 0; p < trackSmol.size(); p++) {
				System.out.println(trackSmol.get(p));
			}

			int k = 0, j = 0, counter = 0;
			int index = 0;

			while (j < trackBig.size()) {
				if (trackSmol.get(k) == trackBig.get(j)) {
					index = j;
					break;
				} else
					j++;
			}

			while (j < trackBig.size() && k < trackSmol.size()) {
				if (trackBig.get(j) != trackSmol.get(k))
					return false;
				k++;
				j++;
			}

			// return counter == trackSmol.size() ? true : false;
			return (j == k || (j == trackBig.size() && k == trackSmol.size())) ? true : false;
		}
}
