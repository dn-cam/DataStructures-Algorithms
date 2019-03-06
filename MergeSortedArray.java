/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (m == 0 && n > 0)
			nums1[0] = nums2[0];

		int i = m - 1, j = n - 1, k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] >= nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			} else {
				nums1[k] = nums2[j];
				j--;
				k--;
			}
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}
	}
}
