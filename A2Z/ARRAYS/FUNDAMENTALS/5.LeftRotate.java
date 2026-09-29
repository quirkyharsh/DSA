class Solution {
    public void rotateArrayByOne(int[] nums) {
        if (nums == null || nums.length <= 1) return;

        int last = nums[nums.length - 1];

        for (int i = nums.length - 1; i > 0; i--) {
            nums[i] = nums[i - 1];
        }

        nums[0] = last;
    }
}