class Solution {
    public void sortInWave(int arr[]) {
        // code here
        int first = 0;
        int second = 1;
        
        int temp = 0;
        
        while(second < arr.length){
            temp = arr[second];
            arr[second] = arr[first];
            arr[first] = temp;
            
            first += 2;
            second += 2;
            
        }
        
        
        
    }
}
