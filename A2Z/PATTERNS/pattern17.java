class Solution {
    public void pattern17(int n) {
        for (int i = 1; i <= n; i++) {
            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Palindromic letters (ascend to peak, then descend)
            char ch = 'A';
            int breakpoint = (2 * i - 1) / 2;
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print(ch);
                if (k <= breakpoint) {
                    ch++;
                } else {
                    ch--;
                }
            }

            System.out.println();
        }
    }
}