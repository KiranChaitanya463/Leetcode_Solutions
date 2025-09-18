import java.util.HashMap;
import java.util.Map;

// lc560
// have to find number of subarrays with sum k
// track the sum and keep track with hashmap and the number of same sums one dry run you'll understand
public class NoOfSubArraySumK{
    public int subarraySum(int[] nums, int k) {
        if(nums.length==1){
            if(nums[0]==k) return 1;
            return 0;
        }
        Map<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1);
        int sum = 0, count = 0;

        for (int num : nums) {
            sum += num;

            if (prefixSumCount.containsKey(sum - k)) {
                count += prefixSumCount.get(sum - k);
            }

            prefixSumCount.put(sum, prefixSumCount.getOrDefault(sum, 0) + 1);
        }

        return count;
    }
}