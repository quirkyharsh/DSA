class Solution {
    public int pascalTriangleI(int r, int c) {
        int result = 1;
        
        long val = 1;
        for (int i = 1; i < c; i++) {
            val = val * (r - i) / i;
            result = (int) val;
        }
        
        return result;
    }
}

/*
class Solution {
    public void printPascalTriangle(int numRows) {
        for (int i = 1; i <= numRows; i++) {
            long val = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(val + " ");
                val = val * (i - j) / j;
            }
            System.out.println();
        }
    }
}
*/
