package Binary_Search;

public class Square_Root_LC_69 {

    /* 
     * based on the binary search on answers where a pattren exists that for upto ceratin element the condition will be true and then reamaining false.
     */

    public int mySqrt(int x) {
        if(x<=1)
        return x;
        int l=1;
        int h=x;
        int ans=1;
        while(l<=h){
            int mid=l+(h-l)/2;
            long square=(long)mid*mid;
            if(square>x){
                h=mid-1;
            }
            else{
                ans=mid;
                l=mid+1;
            }
        }
        return ans;
    }
    
}
