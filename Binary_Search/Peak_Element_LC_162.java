package Binary_Search;

public class Peak_Element_LC_162 {

    /* 
     *  based on the residing elements we manage our search space
     */
    
    public int findPeakElement(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int mid=0;
        while(l<h){
            mid=l+(h-l)/2;
            if(nums[mid]>nums[mid+1]){
                h=mid;
            }
            else
                l=mid+1;
        }
        return l;
}

}