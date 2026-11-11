class Solution {
    public int countOccurrences(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        int count = 0;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (nums[mid] == target) {
                count++; 

                int leftCounter = mid - 1;
                while (leftCounter >= 0 && nums[leftCounter] == target) {
                    count++;
                    leftCounter--;
                }
                
                int rightCounter = mid + 1;
                while (rightCounter < nums.length && nums[rightCounter] == target) {
                    count++;
                    rightCounter++;
                }
                
                return count; 
            } 
            else if (nums[mid] > target) {
                high = mid - 1;
            } 
            else {
                low = mid + 1;
            }
        }
        return count; 
    }
}