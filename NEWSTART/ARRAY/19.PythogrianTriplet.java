class Solution {
    boolean pythagoreanTriplet(int[] arr) {
        // code here
        int n = arr.length;
        
        for(int i = 0; i < n; i++){
            arr[i] = arr[i]*arr[i];
        }
        
        Arrays.sort(arr);
        
        for (int c = n - 1; c >= 2; c--) {

                    int left = 0;
                    int right = c - 1;

                    while (left < right) {

                        int sum = arr[left] + arr[right];

                        if (sum == arr[c]) {
                            return true;
                        }
                        else if (sum < arr[c]) {
                            left++;
                        }
                        else {
                            right--;
                        }
                    }
                }

                return false;
    }
}