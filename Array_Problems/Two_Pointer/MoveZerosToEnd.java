package Array_Problems.Two_Pointer;


//lc283

// by first finding the first zero and then maintaning the two pointers and keep the i at non zero position 
// and iterating the j pointer and when the non zero found we swap with the i 

public class MoveZerosToEnd {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0;
        while(i<n && nums[i]!=0) i++;
        if(i>=n) return;
        int j=i;
        while(j<n){
            if(nums[j]!=0){
                swap(nums,i,j);
                i++;
                j++;
            }
            else
                j++;
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
