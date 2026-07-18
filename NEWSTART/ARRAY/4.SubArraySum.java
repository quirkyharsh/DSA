class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> ans = new ArrayList<>();

        int start = 0;
        int currSum = 0;

        for (int end = 0; end < arr.length; end++) {
            currSum += arr[end];

            while (currSum > target && start <= end) {
                currSum -= arr[start];
                start++;
            }

            if (currSum == target) {
                ans.add(start + 1);
                ans.add(end + 1);  
                return ans;
            }
        }

        ans.add(-1);
        return ans;
    }
}
