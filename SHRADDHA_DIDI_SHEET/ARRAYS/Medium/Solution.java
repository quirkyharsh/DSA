

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        long n = A.length;
        long expectedSum = n * (n + 1) / 2;
        long actualSum = 0;
        
        int duplicate = -1;
        
        int expectedNumber = 1;
        
        for (int i = 0; i < n; i++) {
            
            actualSum += A[i];
            
            if (A[i] != expectedNumber) {
                
                if (i > 0 && A[i] == A[i - 1]) {
                    duplicate = A[i];
                }
            }
            
            expectedNumber++;
        }
        
        // missing = duplicate - (actualSum - expectedSum)
        long missing = duplicate - (actualSum - expectedSum);
        
        return new int[]{duplicate, (int) missing};
    }
}