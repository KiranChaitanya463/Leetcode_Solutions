package Binary_Search;

public class Single_Element_LC_540 {
    
    /* 
     *  we know we did with that xor to find the single element while all other appears twice but for one element appears once
     *  the idea behind is so for every pair of element the indexs would be odd and even based on that we proceed
     *  so for if it is in normal flow the first element of the pair would be on the even index and second element would be on the odd index
     *  so if this pattren stops that means a single element distrubs this pattren so based on that we manage our search space.
     */
    public int singleNonDuplicate(int[] nums) {
        int n=nums.length;
        if(n==1)return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        int low=1;
        int high=nums.length-2;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]!=nums[mid+1] && nums[mid]!=nums[mid-1]) return nums[mid];
            if((mid%2==1 && nums[mid-1]==nums[mid]) || (mid%2==0) && nums[mid]==nums[mid+1]){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
}
