class Solution {
    public void sortZeroOneTwo(int[] nums) {
        
        int zeroCount = 0;
        int oneCount = 0;
        int twoCount = 0;

        for(int value: nums){
            if(value == 0){
                zeroCount++;
            }else if(value == 1){
                oneCount++;
            }else if(value == 2){
                twoCount++;
            }
        }

        int index = 0;

        for(int i = 0; i < zeroCount; i++){
            nums[index] = 0;
            index++;
        }

        for(int i = 0; i < oneCount; i++){
            nums[index] = 1;
            index++;
        }

        for(int i = 0; i < twoCount; i++){
            nums[index] = 2;
            index++;
        }

        
    }
}