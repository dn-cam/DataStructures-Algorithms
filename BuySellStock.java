/**
 * 
 */

/**
 * @author camelliadebnath 06-Mar-2019
 */
public class BuySellStock {
	public int maxProfit(int[] prices) {
		int maxprof = 0;
		for (int i = 1; i < prices.length; i++)
			if (prices[i - 1] < prices[i])
				maxprof += prices[i] - prices[i - 1];

		return maxprof;
	}
}
