class Solution {
    public void pattern12(int n) {
        int spaces = 2 * (n - 1);
        for (int i = 1; i <= n; i++) {
            // Numbers on the left
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            // Numbers on the right
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
            spaces -= 2;
        }
    }
}