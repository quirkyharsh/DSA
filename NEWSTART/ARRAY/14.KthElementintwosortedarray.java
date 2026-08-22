class Solution {
    public int kthElement(int a[], int b[], int k) {
        // code here
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i = 0;i < a.length - 1;i++){
            arr.add(a[i]);
        }
        
        for(int i = 0;i < b.length - 1;i++){
            arr.add(b[i]);
        }
        
        Collections.sort(arr);
        
        return arr.get(k - 1);
    }
}