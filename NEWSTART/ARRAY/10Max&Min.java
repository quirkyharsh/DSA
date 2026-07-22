class Solution {
    public ArrayList<Integer> getMinMax(int[] arr) {

        int min = arr[0];
        int max = arr[0];

        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

            if (arr[i] < min) {
                min = arr[i];
            }
        }

        result.add(min);
        result.add(max);

        return result;
    }
}