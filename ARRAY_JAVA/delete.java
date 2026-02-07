import java.util.*;

class Solution {
    ArrayList<Integer> removeDuplicates(int[] arr) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int num:arr){
            if(set.contains(num)){
                continue;
            }else {
                set.add(num);
            }
        }
        
        return new ArrayList<>(set);
    }
}
