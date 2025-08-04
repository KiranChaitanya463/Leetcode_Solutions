package Binary_Search;

public class Find_Min_In_Rotated_Sorted_Array_LC_153 {
    
    /* 
     * to find the minimum in a roated sorted array we adjust the search space based on the below conditions
     */
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        if(nums[low]<=nums[high])
            return nums[low];
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]<nums[low]){
                ans=Math.min(ans,nums[mid]);
                high=mid-1;
            }
            else{
                ans=Math.min(ans,nums[low]);
                low=mid+1;
            }
        }
        return ans;
    }
}
