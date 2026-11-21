class Solution {
    public String largeOddNum(String s) {
        int end = -1;
        for (int i = s.length() - 1; i >= 0; i--) {
            if ((int)(s.charAt(i) - '0') % 2 != 0) {
                end = i;
                break;
            }
        }

        if (end == -1) {
            return "";
        }

        int start = 0;
        while (start < end && s.charAt(start) == '0') {
            start++;
        }

        return s.substring(start, end + 1);
    }
}