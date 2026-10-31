class Solution {
    public void pattern15(int n) {
        for(int i = 1; i <= n; i++){
            for(int j = 1;j <= n + 1 - i; j++){
                System.out.print((char) (j + 64));
            }
            System.out.println();
        }
    }
}