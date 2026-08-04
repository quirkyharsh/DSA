class Solution {
    public char nonRepeatingChar(String s) {
        char arr[] = s.toCharArray();

        for (int i = 0; i < arr.length; i++) {
            boolean isTrue = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isTrue = false;
                    break;
                }
            }

            if (isTrue) {
                return arr[i];
            }
        }

        return '$';
    }
}