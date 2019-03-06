/**
 * 
 */

/**
 * @author camelliadebnath
 * 06-Mar-2019
 */
public class MajorityElement {
    public boolean EqualityTest(int a, int b){
        return (a == b);
    }
    
    public int majorityElementCount(int[] nums, int l, int h) {
        
        if(h - l == 0 || h - l == 1)
            if(nums[l] == nums[h])
                return nums[l];
        
        int mid = l + (h-l)/2;
        int left = majorityElementCount(nums, l, mid);
        int right = majorityElementCount(nums, mid+1, h);
        
        if(left == right)
            return left;
        
        int leftCount = 0;
        int rightCount = 0;
        
        for(int i = l; i <= h; i++){
            if(EqualityTest(nums[i], left))
                leftCount++;
            if(EqualityTest(nums[i], right))
                rightCount++;
        }
        
        return leftCount > rightCount ? left : right;
    }
    
    public int majorityElement(int[] nums){
        return majorityElementCount(nums, 0, nums.length -1 );
    }

}
