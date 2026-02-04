import java.util.Dictionary;
import java.util.Hashtable;

class dictionary {
    int majorityElement(int arr[]) {
        // code here
        int limit = arr.length/2;
        Dictionary <Integer, Integer> dict = new Hashtable<>();
        
        for(int x:arr){
            if(dict.get(x) == null){
                dict.put(x,1);
            }else{
                dict.put(x,dict.get(x)+1);
            }
        }
        
        for(int x:arr){
            if(dict.get(x) > limit){
                return x;
            }
        }
        
        return -1;
        
    }
}