import java.util.*;

class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for(int row[]: accounts){
            if(Arrays.stream(row).sum() > max){
                max = Arrays.stream(row).sum();
            }
        }

        return max;
    }
}