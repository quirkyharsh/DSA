class Solution {

    private int power(int mid, int n, int m){
        int ans = 1;          
        for(int i = 1; i <= n; i++){
            ans = ans*mid;         13*13*13
            if(ans > m) return 2;
        } 
        if(ans == m) return 1;
        return 0; 
    }

    public int NthRoot(int N, int M) {
        
        int low = 1;
        int high = M;            // 27

        while(low <= high){
            int mid = low + (high - low) / 2;    //13

            int instance = power(mid, N, M);

            if(instance == 1){
                return mid;
            } else if(instance == 2){
                high = mid - 1;
            }else{
                low = mid + 1;
            }
        }

        return -1;
    }
}
