class Solution {
    public int pivotInteger(int n) {
        if(n == 1){
            return 1;
        }
        int totalSum = n*(n + 1) / 2;

        int leftSum = 0;

        for(int i = 1; i < n - 1; i++){
            int rightSum = totalSum - leftSum - i;

            if(leftSum == rightSum){
                return i;
            }

            leftSum = leftSum + i;
        }

        return -1;
    }
}