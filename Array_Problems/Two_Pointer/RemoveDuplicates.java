package Array_Problems.Two_Pointer;

//lc26

// so given a sorted array with duplicates we have to adjust the array and return the index where upto that index every element would be unique
// so rather than deleting and adding to new array we have to adjust the elements and we dont care abou the elements after the index
// we have to return the index which will be like the length like i+1.
// so maintaning two pointers and keeping the i for the unique elements and j for traversing through others.

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        int i=0;
        int j=i+1;
        while(j<n){
            if(nums[i]!=nums[j]){
                nums[++i]=nums[j++];
            }
            else
                j++;
        }
        return i+1;
    }
}
