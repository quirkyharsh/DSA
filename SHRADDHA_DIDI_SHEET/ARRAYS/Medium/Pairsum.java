import java.util.*;


class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        // Your code here
        Set<Integer> set = new HashSet<>();
        
        for(int i = 0; i < arr.length; i++){
            int needed = target - arr[i];
            
            if(set.contains(needed)){
                return true;
            }
            
            set.add(arr[i]);
        }
        
        return false;
    }
}
