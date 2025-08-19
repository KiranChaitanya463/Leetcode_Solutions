package Binary_Search;

import java.util.Arrays;

public class Smallest_Divisor_Threshold_LC_1283 {
    
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Arrays.stream(nums).max().getAsInt();
        int ans=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            if(find(nums,mid)<=threshold){
                ans=Math.min(ans,mid);
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
    }
    public int find(int[] nums, int divisor){
        int sum=0;
        for(int i=0;i<nums.length;i++){
            sum+=(int)(Math.ceil((double)nums[i]/divisor));
        }
        return sum;
    }
}
