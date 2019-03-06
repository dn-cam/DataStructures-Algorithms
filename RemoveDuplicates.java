/**
 * 
 */

/**
 * @author camelliadebnath
 * 06-Mar-2019
 */
public class RemoveDuplicates {
	public int removeDuplicates(int[] nums) {
	      int i = 0;    
	      if(nums.length <= 1)
	          return nums.length;
	        
	        for(int j = 0; j<nums.length; j++){
	            if(nums[j] != nums[i]){
	                i++;
	                nums[i] = nums[j];
	            }
	                
	        }
	        return i+1;
	    }

}
