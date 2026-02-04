class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        boolean inc = true;
        boolean desc = true;
        
        for(int i = 0;i < arr.length - 1; i++){
            if(arr[i] > arr[i+1]){
                desc = false;
            }
            
            if(arr[i] < arr[i+1]){
                inc = false;
            }
        }
        
        return inc || desc;
    }
}