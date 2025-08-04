package Binary_Search;

public class Search_In_Rotated_Sorted_Array_LC_81 {

    /* 
     * simailar to the previous one 33 but it contains duplicates so we add a extra condition.
     */

    public boolean search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return true;
            if(nums[mid]>=nums[low]){
                if(nums[low]==nums[mid] && nums[mid]==nums[high]){ // extra condition for duplicates, same code with non duplicates
                    low++;
                    high--;
                    continue;
                }
                if(nums[mid]>=target && nums[low]<=target){
                    high=mid-1;
                }
                else{
                    low=mid+1;
                }
            }
            else{
                if(nums[mid]<=target && target<=nums[high]){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
        }
        return false;
    }
    
}
