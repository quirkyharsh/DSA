class Solution {
    public void arrange(int[] arr) {
        // code here
        
        int temp = 0;
        
        for(int i = 0; i < arr.length; i++){
            arr[i] = arr[i] + (arr[arr[i]] % arr.length) * arr.length;
        }
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] / arr.length;
        }
    }
}