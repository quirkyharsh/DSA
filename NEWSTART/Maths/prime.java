class Solution {
    static boolean isPrime(int n) {
        if (n <= 1) return false;

        // Check every number from 2 up to sqrt(n)
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false; // Found a factor, n is not prime
            }
        }

        return true;
    }
}