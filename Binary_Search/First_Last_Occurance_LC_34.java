package Binary_Search;

public class First_Last_Occurance_LC_34 {
    /* 
     * so consider the target element has multiple occurances in the soted array 
     * we have to find the first and last occurance if that element
     * if does not exists we can return -1,-1
     * so for this we can use the lower and upper bound
     * lower bound would be the first occurance
     * upper bound would be the (last occurance) - 1.
     * lb=lb(x);
     * ub=ub(x)-1;
     * if(lb==n || nums[lb]!=x) return {-1,-1};
     * else return {lb,ub};
     * 
     * for a brute we can go linear and and tract last occurance everytime we encounter one and first will only when first time encounter intially -1,-1
     * 
     */
}
