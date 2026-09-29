class Solution {
    public int secondLargestElement(int[] nums) {
        if (nums == null || nums.length < 2) {
            return -1;
        }

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                secondMax = max;
                max = num;
            } else if (num < max && num > secondMax) {
                secondMax = num;
            }
        }

        return (secondMax == Integer.MIN_VALUE) ? -1 : secondMax;
    }
}