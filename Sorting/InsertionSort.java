package Sorting;

public class InsertionSort {
    public void insertion(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int j=i;
            while(j>0 && nums[j-1]>nums[j]){
                Swap.swap(nums,j-1,j);
                j--;
            }
        }
    }
}
