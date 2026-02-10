import java.util.Arrays;

class Solution {
    public int[] plusOne(int[] digits) {
        int number = 0;
        for (int i = 0; i < digits.length; i++) {
            number = number * 10 + digits[i];
        }

        number += 1;

        String numStr = String.valueOf(number);
        int[] result = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            result[i] = numStr.charAt(i) - '0';
        }

        return result;
    }

}
