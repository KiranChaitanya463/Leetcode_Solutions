package Sorting;

public class BubbleSort {
    public void bubblesort(int[] nums){
        int n=nums.length;
        for(int i=1;i<=n;i++){
            int didSwap=0;
            for(int j=0;j<n-1;j++){
                if(nums[j]>nums[j+1]){
                    Swap.swap(nums,j,j+1);
                    didSwap=1;
                }
            }
            if(didSwap==0){
                break;
            }
        }
    }
}
