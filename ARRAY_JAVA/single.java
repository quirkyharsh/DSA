// User function Template for Java
import java.util.Dictionary;
import java.util.Hashtable;

class Sol {
    public static int search(int n, int arr[]) {
        // your code here
        Dictionary <Integer,Integer> dict = new Hashtable<>();
        
        for(int x:arr){
            if(dict.get(x) == null){
                dict.put(x,1);
            }else{
                dict.put(x, dict.get(x) + 1);
            }
        }
        
        for(int x:arr){
            if(dict.get(x) == 1){
                return x;
            }
        }
        
        return -1;
    }
}