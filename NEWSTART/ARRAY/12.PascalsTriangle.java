class Solution {
    ArrayList<Integer> nthRowOfPascalTriangle(int n) {
        // code here
        ArrayList<Integer> row = new ArrayList<>();
        int val = 1;
        
        row.add(val);
        
        for(int i = 1; i < n; i++){
            val = val * (n-i)/i;
            row.add(val);
        }
        
        return row;
    }
}