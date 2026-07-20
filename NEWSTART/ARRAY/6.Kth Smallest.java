import java.util.*;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        Arrays.sort(arr);
        
        int lowest = 0;
        
        for(int i = 0; i < k; i++){
            lowest = arr[i];
        }
        
        return lowest;
    }
}
