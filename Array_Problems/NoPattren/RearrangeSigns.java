package Array_Problems.NoPattren;


//lc2149
// given and array with equal number of pos and neg we have arrange them like start with pos and neg and pos and so on
// on Constraints it confirm that length>2 and equal number of pos and neg elements.
public class RearrangeSigns {
    // just creating a new array and maintaining the pos index and neg index and switching +2 at their time of pos or neg
    public int[] rearrangeArray(int[] nums) {
        int n=nums.length;
        int[] newNums=new int[n];
        int pi=0;
        int ni=1;
        for(int i: nums){
            if(i>0){
                newNums[pi]=i;
                pi+=2;
            }
            else{
                newNums[ni]=i;
                ni+=2;
            }
        }
        return newNums;
    }
}
