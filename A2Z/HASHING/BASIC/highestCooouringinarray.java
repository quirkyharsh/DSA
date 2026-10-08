class Solution {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> map = HashMap<>();

        for(int i = 0; i <= nums.length - 1; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

    
      

    }
}


