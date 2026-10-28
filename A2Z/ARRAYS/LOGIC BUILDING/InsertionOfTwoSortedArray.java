class Solution {
    public int[] intersectionArray(int[] nums1, int[] nums2) {
        
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> resultList = new ArrayList<>();

        for(int num1: nums1){
            set.add(num1);
        }

        for(int num2: nums2){
            if(set.contains(num2)){
                resultList.add(num2);
                set.remove(num2); 
            }
        }
        
        int[] result = new int[resultList.size()];

        for (int i = 0; i < resultList.size(); i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}