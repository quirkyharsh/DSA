class Solution {
    public List<Integer> majorityElementTwo(int[] nums) {
        int times = nums.length / 3 + 1;
        ArrayList<Integer> list = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }

        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue() >= times){
                list.add(entry.getKey());
            }
        }

        return list;
    }
}