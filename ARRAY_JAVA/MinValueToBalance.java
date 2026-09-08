class Solution {
    public int minValueToBalance(List<Integer> arr) {
        // code here
        int LeftHalfLeft = 0;
        int LeftHalfRight = arr.size()/2 - 1;
        
        int RightHalfLeft = arr.size()/2;
        int RightHalfRight = arr.size() - 1;
        
        int LeftSum = 0;
        int RightSum = 0;
        
        for(int i = 0;i <= LeftHalfRight; i++){
            LeftSum += arr.get(i); 
        }
        
        for(int i = RightHalfLeft;i <= RightHalfRight; i++){
            RightSum += arr.get(i); 
        }
        
        
        return Math.abs(LeftSum - RightSum);
    }
};