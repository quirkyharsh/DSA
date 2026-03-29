class Solution {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        long sumOfSet = 0;
        long sumOfNum = 0;

        for(int num: nums){
            if(!set.contains(num)){
                set.add(num);
                sumOfSet += num;
            }
            sumOfNum += num;
        }

        return (int) (2* sumOfSet - sumOfNum);
    }
}