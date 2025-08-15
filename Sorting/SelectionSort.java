package Sorting;

public class SelectionSort {
    public void selectionsort(int[] nums){
        int n=nums.length;
        for(int i=0;i<n;i++){
            int mini=i;
            for(int j=i+1;j<n;j++){
                if(nums[j]<nums[mini]){
                    mini=j;
                }
            }
            Swap.swap(nums,mini,i);
        }
    }
}
