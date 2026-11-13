class KthMissingPositiveNumber {
    public static int findKthPositive(int[] arr, int k) {

        int count = 1;
        int counter = k;

        for(int num : arr) {

            while(count < num) {
                counter--;

                if(counter == 0) {
                    return count;
                }

                count++;
            }

            count++;
        }

        return count + counter - 1;
    }
}