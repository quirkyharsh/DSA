class Solution {
    public void pattern16(int n) {
        int countChar = 1;

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char) (countChar + 64));
            }
            countChar++;
            System.out.println();
        }
    }
}