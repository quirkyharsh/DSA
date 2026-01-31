class rotate {
    static void rotateArr(int arr[], int d) {
        // code here
        int n = arr.length;
        d = d % n;
        
        
        
        for(int i = 0;i < d; i++){
            int first = arr[0];
            
            for(int j = 0; j < n -1; j++){
                arr[j] = arr[j+1];
            }
            
            arr[n-1] = first;
        }
    }
}