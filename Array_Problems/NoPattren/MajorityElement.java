package Array_Problems.NoPattren;

//lc169
// majority element > n/2  (n=length of the array)
public class MajorityElement{
    public int majorityElement(int[] nums) {
        // Map<Integer,Integer> map=new HashMap<>();
        // for(int i: nums){
        //     map.put(i,map.getOrDefault(i,0)+1);
        // }
        // int n=nums.length;
        // for(int i :map.keySet()){
        //     if(map.get(i)>n/2){
        //         return i;
        //     }
        // }
        // return -1;

        // moore voting algorithm
        // so we maintain count=0 and then maintain an element ele and then
        // so if count==0 we replace the current element with ele and increment count
        // if count!=0 we check if the current element == ele then increment count else decrement count
        // do  dry run you'll understand
        int ele=nums[0];
        int n=nums.length;
        int count=0;
        int i=0;
        while(i<n){
            if(count==0){
                ele=nums[i];
                count++;
            }
            else{
                if(ele!=nums[i]){
                    count--;
                }
                else{
                    count++;
                }
            }
            i++;
        }
        return ele;
    }
}