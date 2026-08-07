import java.util.ArrayList;

class Solution {

    ArrayList<Integer> rotate(int n, int d) {

        ArrayList<Integer> ans = new ArrayList<>();

        String original = Integer.toBinaryString(n);

        // Left Rotation
        String left = original;

        for (int i = 0; i < d; i++) {
            char first = left.charAt(0);
            left = left.substring(1);
            left = left + first;
        }

        int decimal1 = Integer.parseInt(left, 2);

        // Right Rotation
        String right = original;

        for (int i = 0; i < d; i++) {
            char last = right.charAt(right.length() - 1);
            right = right.substring(0, right.length() - 1);
            right = last + right;
        }

        int decimal2 = Integer.parseInt(right, 2);

        ans.add(decimal1);
        ans.add(decimal2);

        return ans;
    }
}