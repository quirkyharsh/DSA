import java.util.*;

class Solution {
    public ArrayList<Integer> kLargest(int[] arr, int k) {
        Arrays.sort(arr);  // sort array
        
        ArrayList<Integer> result = new ArrayList<>();
        
        // take last k elements (largest ones)
        for (int i = arr.length - 1; i >= arr.length - k; i--) {
            result.add(arr[i]);
        }
        
        return result;
    }
}
