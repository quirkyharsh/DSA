class Solution {
    public static String reverseString(String s) {
        int last = s.length() - 1;

        String result = "";

        while (last >= 0) {
            result += s.charAt(last);
            last--;
        }

        return result;
    }
}