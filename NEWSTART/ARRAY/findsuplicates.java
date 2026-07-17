class Solution {
    public List<Integer> findDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> ans = new ArrayList<>();

        for (int num : arr) {
            if (set.contains(num)) {
                ans.add(num);
            } else {
                set.add(num);
            }
        }

        return ans;
    }
}