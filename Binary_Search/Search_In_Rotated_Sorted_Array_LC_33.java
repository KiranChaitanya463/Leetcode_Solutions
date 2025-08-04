package Binary_Search;

public class Search_In_Rotated_Sorted_Array_LC_33 {

    /*  
     * understand based on the conditons
     */

     public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target)
                return mid;
            if(nums[mid]>=nums[low]){
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
        return -1;
    }
    
}
