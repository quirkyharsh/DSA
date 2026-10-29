
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int len = nums1.length - 1;

        for(int num2: nums2){
            nums1[len] = num2;
            len--;
        }

        Arrays.sort(nums1);
        
    }
}