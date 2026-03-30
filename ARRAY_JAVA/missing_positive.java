import java.util.*
;
class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);

        int smallest = 1;

        for(int num: nums){
            if(smallest == num){
                smallest++;
            }
        }
        
        return smallest;
    }
}