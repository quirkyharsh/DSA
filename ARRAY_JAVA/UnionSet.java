import java.util.ArrayList;
import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> set = new HashSet<>();
        
        for(int x: a){
            set.add(x);
        }
        
        for(int y: b){
            set.add(y);
        }
        
        return new ArrayList<>(set);

    }
}