class Solution {
    public int countDigit(int n) {
        int result = 0;

        if(n == 0){
            return 1;
        }

        while(n > 0){
            n = n / 10;
            result++;
        }

        return result;
    }
}