class Solution
{
public int getTarget(int [] nums,int target,int low,int high)
    {
    if(target == nums[low])
    {
        return low;
    }
        if(target==nums[high])
        {
            return high;
        }
        
int mid= low+(high-low)/2;
        
        
      
        if (target == nums[mid]) { 
            return mid;
        } 
        
        else if (target < nums[mid]) {
            if (low == mid) {
                // end of search
                return -1;
            } 
            return getTarget(nums, target, low, mid-1);
        } else {
            if (mid == high) {
                // end of search
                return -1;
            }
            return getTarget(nums, target, mid+1, high);
        }       
    }
    
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
      return getTarget(nums,target,low,high);
      
    }
    }
