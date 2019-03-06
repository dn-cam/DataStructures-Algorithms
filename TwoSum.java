/**
 * 
 */
import java.util.*;
/**
 * @author camelliadebnath
 * 06-Mar-2019
 * probmlem statement: https://leetcode.com/problems/two-sum/
 */
public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] solution = new int[2];
        
        for(int i = 0; i < nums.length; i ++){
            map.put(nums[i], i);
            if(map.containsKey(target - nums[i]) && i != map.get(target - nums[i])){
                solution[0] = Math.min(i, map.get(target - nums[i]));
                solution[1] = Math.max(i, map.get(target - nums[i]));
            }
        }
        
        return solution;
        
    }

}
