/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class ContainsDuplicate {
	public boolean containsDuplicate(int[] nums) {
		boolean flag = false;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == nums[i] && i != j) {
					flag = true;

				}

			}
		}
		return flag;
	}
}
