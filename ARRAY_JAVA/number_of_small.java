class Solution {
    public int countOfElements(int x, int arr) {
        int count = 0;

        for (int n : arr) {
            if (n <= x) {
                count++;
            }
        }

        return count;
    }
}
