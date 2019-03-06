/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class MaximumSubarray {
	public int maxSubArray(int[] nums) {
		int n = nums.length;

		int[] M = new int[n];
		M[0] = nums[0];

		for (int i = 1; i < n; i++) {
			M[i] = Math.max(M[i - 1] + nums[i], nums[i]);
		}

		int max = nums[0];

		for (int k = 0; k < n; k++) {
			System.out.println(M[k]);
			if (max <= M[k]) {
				max = M[k];
			}
		}

		return max;

	}
}
