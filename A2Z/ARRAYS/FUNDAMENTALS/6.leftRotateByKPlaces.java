class Solution {
    public void rotateArray(int[] nums, int k) {
        int n = nums.length;
        if (n == 0) return;

        for (int j = 0; j < k; j++) {
            int first = nums[0]; 

            for (int i = 0; i < n - 1; i++) {
                nums[i] = nums[i + 1];
            }

            nums[n - 1] = first; 
        }
    }
}