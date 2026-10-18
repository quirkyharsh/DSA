class Solution {
    public int[] pascalTriangleII(int r) {
        long val = 1;

        int list[] = new int[r];
        list[0] = 1;
        for(int i = 1; i < r; i++){
            val = val * (r - i) / i;

            list[i] = (int) val;

        }

        return list;
    }
}