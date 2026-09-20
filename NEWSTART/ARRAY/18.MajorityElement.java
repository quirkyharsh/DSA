class Solution {
    public ArrayList<Integer> findMajority(int[] arr) {
        // code here
        int n = arr.length; 

        int floorNumber = Math.floorDiv(n, 3); 

        ArrayList<Integer> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < n; i++){
            
            if(!set.contains(arr[i])){
                set.add(arr[i]);
                int freq = 0; 

                for(int j = 0; j < n; j++){ 
                    if(arr[i] == arr[j]){
                        freq++;
                    }
                }

                if(freq > floorNumber){
                    result.add(arr[i]);
                }
            }
        }

        Collections.sort(result);
        return result;
    }
}