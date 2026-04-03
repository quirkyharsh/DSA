class Solution {
    static int inversionCount(int arr[]) {
        int count = 0;
        
        for (int i = 0; i < arr.length; i++) {
            // j starts from i + 1 to check all pairs to the right
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    count++;
                }
            }
        }
        
        return count;
    }
}