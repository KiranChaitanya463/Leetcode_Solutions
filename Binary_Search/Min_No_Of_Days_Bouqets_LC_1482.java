package Binary_Search;

import java.util.Arrays;

public class Min_No_Of_Days_Bouqets_LC_1482{
    
}
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        long val = (long) m * k;
        int n = bloomDay.length;
        if (val > n) return -1;
        int low=Arrays.stream(bloomDay).min().getAsInt();
        int high=Arrays.stream(bloomDay).max().getAsInt();
        while (low <= high) {
            int mid = (low + high) / 2;
            if (possible(bloomDay, mid, m, k)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low;
    }
    public boolean possible(int[] arr, int day, int m, int k) {
        int n = arr.length; 
        int cnt = 0;
        int noOfB = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] <= day) {
                cnt++;
            } else {
                noOfB += (cnt / k);
                cnt = 0;
            }
        }
        noOfB += (cnt / k);
        return noOfB >= m;
    }
}
