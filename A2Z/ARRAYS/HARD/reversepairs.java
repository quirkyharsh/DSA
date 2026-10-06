class Solution {
    public int reversePairs(int[] nums) {
        
        int output = 0;

        for(int i = 0; i < nums.length - 1;i++){
            for(int j = 1; j < nums.length - 1; j++){
                if(nums[i] > nums[j] * 2){
                    output += 1;
                }
            }
        }

        return output;
    }
}