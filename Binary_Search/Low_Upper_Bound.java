package Binary_Search;

public class Low_Upper_Bound {
    
    /* 
    * so basically this lower and upper bound pattren is to find a certain element based on another element in a sorted array on conditions (>= and >)
    * this pattren can use in multiple problems
    */

    private int lowerBound(int[] nums, int target){
        // assume we return the index it actually if the element exists then it will return the lower bound else the element next to it which comes in order
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>=target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

    private int upperBound(int[] nums, int target){
        // assume we return the index it actually if the element exists then it will return the next to it which comes in order
        int n=nums.length;
        int low=0;
        int high=n-1;
        int ans=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]>target){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }

}