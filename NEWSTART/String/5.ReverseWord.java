class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != '.') {
                word.insert(0, s.charAt(i));
            } else {
                if (word.length() > 0) {
                    if (ans.length() > 0)
                        ans.append(".");
                    ans.append(word);
                    word.setLength(0);
                }
            }
        }

        if (word.length() > 0) {
            if (ans.length() > 0)
                ans.append(".");
            ans.append(word);
        }

        return ans.toString();
    }
}
