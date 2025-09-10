package Array_Problems.NoPattren;


//lc136

//  using xor

public class SingleNumber{
    public int singleNumber(int[] nums) {
        int unique=0;
        for(int i: nums){
            unique^=i;
        }
        return unique;
    }
}