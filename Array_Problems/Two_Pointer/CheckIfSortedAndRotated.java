package Array_Problems.Two_Pointer;


//lc1752

// check if the array is sorted and rotated

// This approach is to first find the index where the array is rotated and then by maintaining the last element check if sorted or not.

// Another approach would be after finding the index we may also reverse the array and check also but above is in one itteration to check rather than reverse which takes another itteration.

public class CheckIfSortedAndRotated{
    public boolean check(int[] nums) {
        if(nums.length==1) return true;
        int index=findIndex(nums);
        if(index==-1) return true;
        else{
            return checkIfSorted(nums,index);
        }
    }
    public boolean checkIfSorted(int[] nums,int index){
        int last=Integer.MIN_VALUE;
        int n=nums.length;
        for(int i=index;i<n;i++){
            if(last>nums[i]) return false;
            last=nums[i];
        }
        for(int i=0;i<index;i++){
            if(last>nums[i]) return false;
            last=nums[i];
        }
        return true;
    }
    public int findIndex(int[] nums){
        int n=nums.length;
        for(int i=0;i<n-1;i++){
            if(nums[i]>nums[i+1]) return i+1;
        }
        return -1;
    }
}