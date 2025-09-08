package Array_Problems.Two_Pointer;


//lc189

// by rotating the partial array of size as shown in the below we can rotate the array 
// we can ensure that if the number of times exceeds the length we can use the reminder k=k%N 

public class RotateArrayBydPlaces {
    public void rotate(int[] nums, int k) {
        int n=nums.length;
        k=k%n;
        if(k==0) return;
        reverse(nums,0,n-k-1);
        reverse(nums,n-k,n-1);
        reverse(nums,0,n-1);
    }
    public void reverse(int[] nums,int st,int end){
        while(st<end){
            int temp=nums[st];
            nums[st]=nums[end];
            nums[end]=temp;
            st++;
            end--;
        }
    }
}
