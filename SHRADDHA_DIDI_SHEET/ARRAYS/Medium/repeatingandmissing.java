

public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        
        int n = A.length;
        
        long S = (long)n * (n + 1) / 2;
        long Sq = (long)n * (n+1) *(2*n + 1) / 2;
        
        long S_actual = 0;
        long Sq_actual = 0;
        
        for(int x: A){
            S_actual += x;
            Sq_actual += x*x;
        }
        
        long S_diff = S_actual - S;
        long Sq_diff = Sq_actual - Sq;
        
        long sumAB = Sq_diff / S_diff;        

        int a = (int)((S_diff + sumAB) / 2);  
        int b = (int)(a - S_diff);            

        return new int[]{a, b};
    }
}
