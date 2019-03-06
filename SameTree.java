/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class SameTree {

	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean isSameTree(TreeNode p, TreeNode q) {

		if (p == null || q == null || p.val != q.val)
			return false;
		else if (p.left != q.left || p.right != q.right)
			return false;
		else if (p.left == q.left && p.right == q.right) {
			isSameTree(p.left, q.left);
			isSameTree(p.right, q.right);
		}
		return true;
	}

}
