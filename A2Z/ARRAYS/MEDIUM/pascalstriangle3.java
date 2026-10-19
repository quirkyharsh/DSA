class Solution {
    public List<List<Integer>> pascalTriangleIII(int n) {
        
        List<List<Integer>> list = new ArrayList<>();

        
        for(int i = 1; i <= n;i++){

            long val = 1;
            List<Integer> column = new ArrayList<>();

            for(int j = 1; j <= i; j++){
                column.add((int)val);
                val = val*(i - j)/j;
                
            }

            list.add(column);
            
        }

        return list;
    }
}