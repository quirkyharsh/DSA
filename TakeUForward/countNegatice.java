class Solution {
    public int countNegatives(int[][] grid) {
        int negative = 0;

        for(int[] rows : grid){
            for(int value: rows){
                if(value < 0){
                    negative++;
                }
            }
        }

        return negative;
    }
}