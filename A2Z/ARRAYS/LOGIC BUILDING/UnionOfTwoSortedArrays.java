import java.util.ArrayList;

class Solution {
    public int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0, j = 0;
        int n1 = nums1.length, n2 = nums2.length;

        while (i < n1 && j < n2) {
            if (nums1[i] <= nums2[j]) {
                if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                    list.add(nums1[i]);
                }
                i++;
            } else {
                if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                    list.add(nums2[j]);
                }
                j++;
            }
        }

        while (i < n1) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums1[i]) {
                list.add(nums1[i]);
            }
            i++;
        }

        while (j < n2) {
            if (list.isEmpty() || list.get(list.size() - 1) != nums2[j]) {
                list.add(nums2[j]);
            }
            j++;
        }

        int[] result = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            result[k] = list.get(k);
        }

        return result;
    }
}