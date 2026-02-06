class Solution {
    public static boolean isPalinArray(int[] arr) {

        for (int num : arr) {
            int original = num;
            int rev = 0;

            while (num > 0) {
                int last_digit = num % 10;
                rev = rev * 10 + last_digit;
                num = num / 10;
            }

            if (original != rev) {
                return false;
            }
        }

        return true;
    }
}
