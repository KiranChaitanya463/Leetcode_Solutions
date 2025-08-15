package Sorting;

public class QuickSort {
    public  void qs(int[] nums,int low,int high){
        if(low<high) {
            int pivotInd = partition(nums, low, high);
            qs(nums, low, pivotInd - 1);
            qs(nums, pivotInd + 1, high);
        }
    }
    public  int partition(int[] nums,int low,int high){
        int pivot=nums[low];
        int i=low;
        int j=high;
        while(i<j){
            while(nums[i]<=pivot && i<=high-1){
                i++;
            }
            while(nums[j]>pivot && j>=low+1){
                j--;
            }
            if(i<j) {
                Swap.swap(nums, i, j);
            }
        }
        Swap.swap(nums,low,j);
        return j;
    }
}
