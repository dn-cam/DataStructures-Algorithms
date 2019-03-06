/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 * problem statement: https://leetcode.com/problems/container-with-most-water/
 */
public class MostWater {
	public int maxArea(int[] height) {

		int max = 0;

		int l = 0;
		int r = height.length - 1;

		while (r > l) {
			max = Math.max(max, (r - l) * Math.min(height[r], height[l]));

			if (height[l] < height[r])
				l++;
			else
				r--;

		}

		return max;
	}

}
