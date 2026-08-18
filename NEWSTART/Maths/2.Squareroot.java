class Solution {
    int floorSqrt(int n) {
        // code here
        if(n == 0 || n == 1){
            return n;
        }
        
        int low = 1;
        int high = n; 
        int ans = 0;
        
        while(low <= high){
            int mid = (low + high)/2;
            
            if(mid*mid <= n){
                low = mid + 1;
                ans = mid;
            }else{
                high = mid - 1;
            }
        }
        
        return ans;
    }
}