package Array_Problems.Two_Pointer;



//lc485
public class MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int n=nums.length;
        int maxLength=0;
        int i=0;
        int j=0;
        while(j<n){
            if(nums[j]!=0){
                maxLength=Math.max(maxLength,j-i+1);
                j++;
            }
            else{
                j++;
                i=j;
            }
        }
        return maxLength;
    }
}
