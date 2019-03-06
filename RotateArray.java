/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class RotateArray {

	public void rotate(int[] nums, int k) {
		int i = 0;
		int[] arr = new int[nums.length];

		if (k >= nums.length)
			k = k - nums.length;

		while (i < nums.length) {
			if (i + k >= nums.length)
				arr[(i + k) - nums.length] = nums[i];
			else
				arr[i + k] = nums[i];
			i++;
		}

		for (int j = 0; j < nums.length; j++)
			nums[j] = arr[j];
	}

}
