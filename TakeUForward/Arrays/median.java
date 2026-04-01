import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;

        int[] result = new int[n1 + n2];

        // Copy elements manually
        int k = 0;
        for (int i = 0; i < n1; i++) {
            result[k++] = nums1[i];
        }

        for (int i = 0; i < n2; i++) {
            result[k++] = nums2[i];
        }

        Arrays.sort(result);

        int n = result.length;

        if (n % 2 == 0) {
            return (result[n / 2] + result[n / 2 - 1]) / 2.0;
        } else {
            return result[n / 2];
        }
    }
}