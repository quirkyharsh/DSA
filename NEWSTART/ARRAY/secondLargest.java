class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int firstMax = -1;
        int secondMax = -1;
        
        for(int n: arr){
            if(n > firstMax){
                secondMax = firstMax;
                firstMax = n;
            }else if (n > secondMax && n != firstMax) {
                secondMax = n;
            }
        }
        
        return secondMax;
    }
}