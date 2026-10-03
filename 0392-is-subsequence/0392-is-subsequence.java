class Solution {
    public boolean isSubsequence(String s, String t) {

        int i = 0; // points to s
        int j = 0; // points to t

        while (i < s.length() && j < t.length()) {

            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }

            j++;
        }

        return i == s.length();
    }
}
