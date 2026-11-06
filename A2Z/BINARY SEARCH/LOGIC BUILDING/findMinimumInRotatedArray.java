class Solution {
    public int findMin(ArrayList<Integer> arr) {
        int left = 0;
        int right = arr.size() - 1;
        int ans = Integer.MAX_VALUE;

        while (left <= right) {
            // If the search space is already sorted, 
            // the first element is the minimum of this range
            if (arr.get(left) <= arr.get(right)) {
                ans = Math.min(ans, arr.get(left));
                break;
            }

            int mid = left + (right - left) / 2;

            // Left half is sorted, take the minimum and move to the right
            if (arr.get(left) <= arr.get(mid)) {
                ans = Math.min(ans, arr.get(left));
                left = mid + 1;
            } 
            // Right half is sorted, take the minimum and move to the left
            else {
                ans = Math.min(ans, arr.get(mid));
                right = mid - 1;
            }
        }
        return ans;
    }
}