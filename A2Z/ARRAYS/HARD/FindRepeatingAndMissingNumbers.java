class Solution {
    public int[] findMissingRepeatingNumbers(int[] nums) {
        int result[] = new int[2];
        int frequency[] = new int[nums.length + 1];

        for (int num : nums){
            frequency[num]++;
        }

        for(int i = 0; i < frequency.length; i++){
            if(frequency[i] == 0){
                result[1] = i;
            }

            if(frequency[i] == 2){
                result[0] = i;
            }
        }

        return result;
    }
}