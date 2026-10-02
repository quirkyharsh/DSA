import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums = {16, 17, 4, 3, 5, 2};

        List<Integer> result = sol.leaders(nums);
        System.out.println("Leaders: " + result);
    }
}

class Solution {
    public List<Integer> leaders(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;

        int maxSoFar = nums[nums.length - 1];
        result.add(maxSoFar);

        // Iterate backward (decrementing i--)
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= maxSoFar) {
                maxSoFar = nums[i];
                result.add(maxSoFar);
            }
        }

        // Reverse to maintain left-to-right order
        Collections.reverse(result);
        return result;
    }
}