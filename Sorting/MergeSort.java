package Sorting;

import java.util.ArrayList;
import java.util.List;

public class MergeSort {
    public void mergesort(int[] nums,int low,int high){
        if(low>=high) return;
        int mid=(low+high)/2;
        mergesort(nums,low,mid);
        mergesort(nums,mid+1,high);
        merge(nums,low,mid,high);
    }
    public void merge(int[] nums,int low,int mid,int high){
        List<Integer> list=new ArrayList<>();
        int left=low;
        int right=mid+1;
        while(left<=mid && right<=high){
            if(nums[left]<nums[right]){
                list.add(nums[left]);
                left++;
            }
            else{
                list.add(nums[right]);
                right++;
            }
        }
        while(left<=mid){
            list.add(nums[left++]);
        }
        while(right<=high){
            list.add(nums[right++]);
        }
        for(int i=low;i<=high;i++){
            nums[i]=list.get(i-low);
        }
    }
}
